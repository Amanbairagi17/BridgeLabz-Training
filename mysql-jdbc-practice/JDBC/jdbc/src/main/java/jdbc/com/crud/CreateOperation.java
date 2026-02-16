package jdbc.com.crud;
import java.sql.Statement;
import java.sql.Connection;

import jdbc.com.basic.*;

public class CreateOperation {
	private static String createTable() {
		return "CREATE TABLE students (\r\n"
				+ "id INT AUTO_INCREMENT PRIMARY KEY,\r\n"
				+ "name VARCHAR(100) NOT NULL,\r\n"
				+ "email VARCHAR(100) UNIQUE NOT NULL,\r\n"
				+ "age INT,\r\n"
				+ "grade VARCHAR(10),\r\n"
				+ "enrollment_date DATE\r\n"
				+ ");";
	}
	public static void main(String[] args) {
		try(Connection connection = DatabaseConnection.getConnectionNow();
			Statement statement = connection.createStatement()){
			statement.executeUpdate(createTable());
			System.out.print("Table Created Succesfully!1");
		}
		catch (Exception e) {
			System.out.println("Error while create query");
		}
	}
}
