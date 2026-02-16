package jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			connection = DatabaseConnection.getConnectionNow();
			connection.setAutoCommit(false);
			
			String fromSql = "update account set balance = balance - ? where id = ? and balance >= ?";
			String toSql = "update account set balance = balance + ? where id = ?";
			String insertString = "insert into transactions (fromAcc, toAcc, money, operations)  values(?,?,?,?)";
			
			
			PreparedStatement fromAcc = connection.prepareStatement(fromSql);
			
			fromAcc.setDouble(1, 300);
			fromAcc.setInt(2, 101);
			fromAcc.setDouble(3, 300);

			
			int row1 = fromAcc.executeUpdate();
			
			PreparedStatement toAcc = connection.prepareStatement(toSql);
			toAcc.setDouble(1, 300);
			toAcc.setInt(2, 102);
			
			int row2 = toAcc.executeUpdate();
			
			PreparedStatement setValue = connection.prepareStatement(insertString);
			
			setValue.setInt(1,101);
			setValue.setInt(2, 102);
			setValue.setDouble(3, 300);
			setValue.setString(4, "Done");
			
			int row3 = setValue.executeUpdate();

			if(row1 > 0 && row2 > 0 && row3 > 0) {
			    connection.commit();
			} else {
				connection.rollback();
				System.out.println("Transactin Failed !!");
			}
		} catch (Exception e) {
			try {
				if(connection != null) {
					connection.rollback();
					 System.out.println("Transaction failed due to error: " + e.getMessage());
				}
			}catch (SQLException se) {
				System.out.println("Rollback failed: " + se.getMessage());
			}
			e.printStackTrace();
			
			
		}
		finally {
			try {
				if(connection != null) {
					connection.setAutoCommit(true);
					connection.close();
					System.out.println("Connection closed");
				}
			} catch (Exception e2) {
				System.out.println("Error while closing connection: " + e2.getMessage());
			}
		}
	}
}
