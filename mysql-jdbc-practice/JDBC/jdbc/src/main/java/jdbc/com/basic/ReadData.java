package jdbc.com.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadData {

    private static String selectQuery() {
        return "select * from user_table";
    }

    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnectionNow();
        	 PreparedStatement  ps = connection.prepareStatement(selectQuery());
        			 ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");

                System.out.println(id + " : " + name + " : " + course);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
