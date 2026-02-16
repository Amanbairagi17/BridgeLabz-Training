package jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
import java.sql.SQLException;

public class TransactionSavepoint {

    public static void main(String[] args) {

        Connection connection = null;
        Savepoint savepoint = null;

        try {
            connection = DatabaseConnection.getConnectionNow();
            connection.setAutoCommit(false); // REQUIRED for savepoint

            String debitSql =
                    "UPDATE account SET balance = balance - ? WHERE id = ? AND balance >= ?";
            String creditSql =
                    "UPDATE account SET balance = balance + ? WHERE id = ?";
            String insertSql =
                    "INSERT INTO transactions (fromAcc, toAcc, money, operations) VALUES (?,?,?,?)";

            // debit from Aman (101)
            PreparedStatement debitStmt = connection.prepareStatement(debitSql);
            debitStmt.setDouble(1, 300);
            debitStmt.setInt(2, 101);
            debitStmt.setDouble(3, 300);

            int debitRows = debitStmt.executeUpdate();

            if (debitRows == 0) {
                connection.rollback();
                System.out.println("Transaction Failed: Insufficient balance");
                return;
            }

            // savepoint after successful debit
            savepoint = connection.setSavepoint("AFTER_DEBIT");

            // credit to Tarun (103)
            PreparedStatement creditStmt = connection.prepareStatement(creditSql);
            creditStmt.setDouble(1, 300);
            creditStmt.setInt(2, 103);

            int creditRows = creditStmt.executeUpdate();

            if (creditRows == 0) {
                connection.rollback(savepoint);
                System.out.println("Transaction Failed: Credit account not found");
                return;
            }

            // insert transaction record
            PreparedStatement insertStmt = connection.prepareStatement(insertSql);
            insertStmt.setInt(1, 101);
            insertStmt.setInt(2, 103);
            insertStmt.setDouble(3, 300);
            insertStmt.setString(4, "DONE");

            int insertRows = insertStmt.executeUpdate();

            if (insertRows == 0) {
                connection.rollback(savepoint);
                System.out.println("Transaction Failed: Insert failed");
                return;
            }

            // Commit if all succeed
            connection.commit();
            System.out.println("Transaction Successful");

        } catch (Exception e) {
            try {
                if (connection != null) {
                    connection.rollback();
                    System.out.println("Transaction failed due to error: " + e.getMessage());
                }
            } catch (SQLException se) {
                System.out.println("Rollback failed: " + se.getMessage());
            }
            e.printStackTrace();

        } finally {
            try {
                if (connection != null) {
                    connection.setAutoCommit(true);
                    connection.close();
                    System.out.println("Connection closed");
                }
            } catch (Exception e) {
                System.out.println("Error while closing connection: " + e.getMessage());
            }
        }
    }
}
