package jdbc.com.crud;

import jdbc.com.basic.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.PreparedStatement;

public class InsertData {
	private static String insertData() {
		return "insert into students (id, name, email, age, grade, enrollment_date) values (?,?,?,?,?,?)";
	}
	
	public static void main(String[] args) {
		try(Connection connection = DatabaseConnection.getConnectionNow();
			PreparedStatement ps = connection.prepareStatement(insertData())){
			
			ps.setInt(1, 211);
			ps.setString(2, "Kanha");
			ps.setString(3, "kanha@mail.com");
			ps.setInt(4, 23);
			ps.setString(5, "B");
			ps.setDate(6, Date.valueOf("2023-12-01"));
			
			int row = ps.executeUpdate();
			System.out.println(row + " Row affected ");
		}catch (Exception e) {
			System.out.println("Error caught !!");
		}
	}
}
