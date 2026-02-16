package jdbc.com.crud;

import jdbc.com.basic.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {

    private static String updateData() {
        return "update students set name = ?, email = ?, age = ?, grade = ? where id = ?";
    }

    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = connection.prepareStatement(updateData())) {

            ps.setString(1, "Aman Kumar");
            ps.setString(2, "aman.kumar@mail.com");
            ps.setInt(3, 24);
            ps.setString(4, "A");
            ps.setInt(5, 111);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
