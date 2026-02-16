package jdbc.com.scenariobased.visitmanagement;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

import jdbc.com.scenariobased.DatabaseConnection;

public class VisitDao {

    // UC-4.1 Record visit + complete appointment (TRANSACTION)
    public void recordVisit(
            int appointmentId,
            int patientId,
            String doctorName,
            String diagnosis,
            String prescription,
            LocalDate visitDate
    ) throws Exception {

        String insertVisitSql =
            "INSERT INTO visits(patient_id,doctor_name,diagnosis,prescription,visit_date) VALUES(?,?,?,?,?)";

        String updateAppointmentSql =
            "UPDATE appointments SET status='completed' WHERE appointment_id=?";

        try (Connection con =  DatabaseConnection.getConnectionNow()) {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(insertVisitSql);
            ps1.setInt(1, patientId);
            ps1.setString(2, doctorName);
            ps1.setString(3, diagnosis);
            ps1.setString(4, prescription);
            ps1.setDate(5, Date.valueOf(visitDate));
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(updateAppointmentSql);
            ps2.setInt(1, appointmentId);
            ps2.executeUpdate();

            con.commit();
        }
    }

    // UC-4.2 View patient medical history
    public void viewMedicalHistory(int patientId) throws Exception {

        String sql =
            "SELECT v.visit_date,v.doctor_name,v.diagnosis,v.prescription " +
            "FROM visits v " +
            "WHERE v.patient_id=? " +
            "ORDER BY v.visit_date DESC";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getDate("visit_date") + " | " +
                    rs.getString("doctor_name") + " | " +
                    rs.getString("diagnosis") + " | " +
                    rs.getString("prescription")
                );
            }
        }
    }

    // UC-4.3 Add prescription details (BATCH INSERT)
    public void addPrescriptions(int visitId, List<String[]> medicines) throws Exception {

        String sql =
            "INSERT INTO prescriptions(visit_id,medicine_name,dosage,duration) VALUES(?,?,?,?)";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            for (String[] med : medicines) {
                ps.setInt(1, visitId);
                ps.setString(2, med[0]);
                ps.setString(3, med[1]);
                ps.setString(4, med[2]);
                ps.addBatch();
            }

            ps.executeBatch();
        }
    }
}
