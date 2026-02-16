package jdbc.com.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateTable {
	private static String updateTable() {
		return "update user_table set name = ? where id = ?;";
	}
	
	public static void main(String[] args) {
		try(Connection connection = DatabaseConnection.getConnectionNow();
			 PreparedStatement ps = connection.prepareStatement(updateTable())){
			
			ps.setString(1, "Ram");
			ps.setInt(2, 2);
			
			int row = ps.executeUpdate();
			System.out.println(row +" One row affected");
		}catch (Exception e) {
			System.out.println("Error while updating");
		}
	}
}
