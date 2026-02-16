package jdbc.com.scenariobased.doctormanagement;


import java.sql.*;

import jdbc.com.scenariobased.DatabaseConnection;

public class DoctorDao {

    // UC-2.1 Add Doctor Profile
    public void addDoctor(Doctor d) throws Exception {
        String sql = "INSERT INTO doctors(name,contact,consultation_fee,specialty_id) VALUES(?,?,?,?)";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, d.name);
            ps.setString(2, d.contact);
            ps.setInt(3, d.consultationFee);
            ps.setInt(4, d.specialtyId);
            ps.executeUpdate();
        }
    }

    // UC-2.2 Assign / Update Specialty (TRANSACTION)
    public void updateSpecialty(int doctorId, int specialtyId) throws Exception {
        String sql = "UPDATE doctors SET specialty_id=? WHERE doctor_id=?";

        try (Connection con = DatabaseConnection.getConnectionNow()) {
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, specialtyId);
            ps.setInt(2, doctorId);
            ps.executeUpdate();

            con.commit();
        }
    }

    // UC-2.3 View Doctors by Specialty
    public void viewDoctorsBySpecialty(String specialtyName) throws Exception {
        String sql =
            "SELECT d.name,d.contact,d.consultation_fee FROM doctors d JOIN specialties s ON d.specialty_id=s.specialty_id WHERE s.specialty_name=? AND d.is_active=TRUE";

        try (Connection con =DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, specialtyName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getString("name") + " | " +
                    rs.getString("contact") + " | " +
                    rs.getInt("consultation_fee")
                );
            }
        }
    }

    // UC-2.4 Deactivate Doctor (Check Future Appointments)
    public void deactivateDoctor(int doctorId) throws Exception {
        String checkSql =
            "SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND appointment_date>CURDATE() AND status='scheduled'";
        String updateSql =
            "UPDATE doctors SET is_active=FALSE WHERE doctor_id=?";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement checkPs = con.prepareStatement(checkSql)) {

            checkPs.setInt(1, doctorId);
            ResultSet rs = checkPs.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0) {
                throw new RuntimeException("Doctor has future appointments");
            }

            PreparedStatement updatePs = con.prepareStatement(updateSql);
            updatePs.setInt(1, doctorId);
            updatePs.executeUpdate();
        }
    }
}
