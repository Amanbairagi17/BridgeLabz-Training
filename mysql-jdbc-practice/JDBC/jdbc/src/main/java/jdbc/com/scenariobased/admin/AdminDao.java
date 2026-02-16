package jdbc.com.scenariobased.admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jdbc.com.scenariobased.DatabaseConnection;

public class AdminDao {

     //  UC-6.1 CRUD – SPECIALTIES (FK-SAFE DELETE)
    public void addSpecialty(String name) throws Exception {
        String sql = "INSERT INTO specialties(specialty_name) VALUES(?)";
        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.executeUpdate();
        }
    }

    public void updateSpecialty(int id, String name) throws Exception {
        String sql = "UPDATE specialties SET specialty_name=? WHERE specialty_id=?";
        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    public void deleteSpecialty(int id) throws Exception {
        String checkSql = "SELECT COUNT(*) FROM doctors WHERE specialty_id=?";
        String deleteSql = "DELETE FROM specialties WHERE specialty_id=?";

        try (Connection con = DatabaseConnection.getConnectionNow()) {
            PreparedStatement checkPs = con.prepareStatement(checkSql);
            checkPs.setInt(1, id);
            ResultSet rs = checkPs.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0)
                throw new RuntimeException("Cannot delete: specialty in use");

            PreparedStatement deletePs = con.prepareStatement(deleteSql);
            deletePs.setInt(1, id);
            deletePs.executeUpdate();
        }
    }

      // UC-6.2 DATABASE BACKUP VALIDATION (METADATA)
    public void validateSchemaForBackup() throws Exception {
        try (Connection con = DatabaseConnection.getConnectionNow()) {
            DatabaseMetaData meta = con.getMetaData();
            ResultSet tables = meta.getTables(null, null, "%", new String[]{"TABLE"});

            System.out.println("Tables available for backup:");
            while (tables.next()) {
                System.out.println("- " + tables.getString("TABLE_NAME"));
            }
        }
    }

      // UC-6.3 VIEW AUDIT LOGS (FILTERED)
    public void viewAuditLogs(String user, String table,
                              Timestamp from, Timestamp to) throws Exception {

        String sql =
            "SELECT * FROM audit_log " +
            "WHERE user_name=? AND table_name=? " +
            "AND action_time BETWEEN ? AND ?";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user);
            ps.setString(2, table);
            ps.setTimestamp(3, from);
            ps.setTimestamp(4, to);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                    rs.getInt("audit_id") + " | " +
                    rs.getString("user_name") + " | " +
                    rs.getString("table_name") + " | " +
                    rs.getString("operation") + " | " +
                    rs.getTimestamp("action_time")
                );
            }
        }
    }
}
