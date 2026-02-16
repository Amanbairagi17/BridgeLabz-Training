package jdbc.com.scenariobased.patientmanagement;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jdbc.com.scenariobased.DatabaseConnection;

public class PatientDao {

    // UC-1.1 Register Patient
    public void registerPatient(Patient p) throws Exception {

        String checkSql = "SELECT COUNT(*) FROM patients WHERE phone=? OR email=?";
        String insertSql = " INSERT INTO patients (name, dob, phone, email, address, blood_group)  VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement checkPs = con.prepareStatement(checkSql)) {

            checkPs.setString(1, p.phone);
            checkPs.setString(2, p.email);

            ResultSet rs = checkPs.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0) {
                throw new RuntimeException("Patient already exists");
            }

            PreparedStatement insertPs = con.prepareStatement(insertSql);
            insertPs.setString(1, p.name);
            insertPs.setDate(2, Date.valueOf(p.dob));
            insertPs.setString(3, p.phone);
            insertPs.setString(4, p.email);
            insertPs.setString(5, p.address);
            insertPs.setString(6, p.bloodGroup);

            insertPs.executeUpdate();
        }
    }

    // UC-1.2 Update Patient
    public void updatePatient(int id, String address, String phone) throws Exception {
        String sql = "UPDATE patients SET address=?, phone=? WHERE patient_id=?";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, address);
            ps.setString(2, phone);
            ps.setInt(3, id);

            ps.executeUpdate();
        }
    }

    // UC-1.3 Search Patient
    public List<Patient> searchByName(String name) throws Exception {

        List<Patient> list = new ArrayList<>();
        String sql = "SELECT * FROM patients WHERE name LIKE ?";

        try (Connection con =DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Patient p = new Patient();
                p.patientId = rs.getInt("patient_id");
                p.name = rs.getString("name");
                p.phone = rs.getString("phone");
                p.email = rs.getString("email");
                list.add(p);
            }
        }
        return list;
    }

    // UC-1.4 View Visit History
    public void viewVisitHistory(int patientId) throws Exception {

        String sql = "SELECT v.visit_date, v.doctor_name, v.diagnosis FROM visits v WHERE v.patient_id = ? ORDER BY v.visit_date";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getDate("visit_date") + " | " +
                    rs.getString("doctor_name") + " | " +
                    rs.getString("diagnosis")
                );
            }
        }
    }
}
