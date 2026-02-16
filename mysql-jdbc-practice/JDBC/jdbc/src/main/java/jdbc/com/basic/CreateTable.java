package jdbc.com.basic;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

    private static String createTable() {
        return "CREATE TABLE user_table (" +
               "id INT PRIMARY KEY, " +
               "name VARCHAR(50), " +
               "course VARCHAR(40)" +
               ")";
    }

    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnectionNow();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(createTable());
            System.out.println("Table created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
