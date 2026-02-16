package jdbc.com.crud;

import jdbc.com.basic.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {
	private static String deleteData() {
		return "delete from students where id=?";
	}
	
	public static void main(String[] args) {
		try(Connection connection = DatabaseConnection.getConnectionNow();
			PreparedStatement ps = connection.prepareStatement(deleteData())){
			ps.setInt(1, 211);
			
			int row = ps.executeUpdate();
			
			System.out.println(row + " Row deleted");
			
		}catch (Exception e) {
			System.out.println("Exceptin caught while deleting");
		}
	}
}

//import jdbc.com.basic.*;
//import java.sql.Connection;
//import java.sql.CallableStatement;
//
//public class DeleteData {
//
//    private static String deleteProcedure() {
//        return "{call delete_student(?)}";
//    }
//
//    public static void main(String[] args) {
//
//        try (Connection connection = DatabaseConnection.getConnectionNow();
//             CallableStatement cs =
//                 connection.prepareCall(deleteProcedure())) {
//
//            cs.setInt(1, 211);   // IN parameter
//
//            int row = cs.executeUpdate();
//
//            System.out.println(row + " Row deleted");
//
//        } catch (Exception e) {
//            System.out.println("Exception caught while deleting");
//            e.printStackTrace();
//        }
//    }
//}

