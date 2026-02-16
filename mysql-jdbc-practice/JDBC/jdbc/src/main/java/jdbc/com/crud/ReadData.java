package jdbc.com.crud;

import jdbc.com.basic.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadData {
	private static String readData() {
		return "select * from students";
	}
	
	public static void main(String[] args) {
		try(Connection connection = DatabaseConnection.getConnectionNow();
			PreparedStatement ps = connection.prepareStatement(readData());
			ResultSet rs = ps.executeQuery()){
			
			 while (rs.next()) {   // very important do not forget
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                int age = rs.getInt("age");
	                String grade = rs.getString("grade");
	                String date = rs.getDate("enrollment_date").toString();

	                System.out.println(
	                        id + " | " + name + " | " + email + " | " +
	                        age + " | " + grade + " | " + date
	                );
	            }
			
		}catch (Exception e) {
			System.out.println("Error while reading data from table !!");
		}
	}
}
