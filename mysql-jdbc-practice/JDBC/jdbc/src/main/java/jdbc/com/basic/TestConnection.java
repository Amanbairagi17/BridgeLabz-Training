package jdbc.com.basic;

import java.sql.Connection;

public class TestConnection {
	public static void main(String[] args) {
		try (Connection con = DatabaseConnection.getConnectionNow()) {
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
