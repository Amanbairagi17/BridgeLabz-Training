package jdbc.com.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertTable {
	private static String insertQuery() {
        return "INSERT INTO user_table (id, name, course) VALUES (?, ?, ?)";
    }

    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = connection.prepareStatement(insertQuery())) {

            ps.setInt(1, 2);
            ps.setString(2, "Kanha");
            ps.setString(3, "Java is good");

            int rows = ps.executeUpdate();
            System.out.println(rows + " row inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
