package jdbc.com.scenariobased.appointmentscheduling;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;

import jdbc.com.scenariobased.DatabaseConnection;

public class AppointmentDao {

    private boolean patientExists(Connection con, int patientId) throws Exception {
        String sql = "SELECT COUNT(*) FROM patients WHERE patient_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, patientId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1) > 0;
    }

    private boolean doctorExists(Connection con, int doctorId) throws Exception {
        String sql = "SELECT COUNT(*) FROM doctors WHERE doctor_id=? AND is_active=TRUE";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, doctorId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1) > 0;
    }

    private boolean slotAvailable(Connection con, int doctorId,
                                  LocalDate date, LocalTime time) throws Exception {
        String sql =
            "SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND appointment_date=? AND appointment_time=? AND status='scheduled'";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, doctorId);
        ps.setDate(2, Date.valueOf(date));
        ps.setTime(3, java.sql.Time.valueOf(time));
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1) == 0;
    }

    public void bookAppointment(int patientId, int doctorId,
                                LocalDate date, LocalTime time) throws Exception {

        String insertSql =
            "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?,?)";

        try (Connection con =DatabaseConnection.getConnectionNow()) {

            //FK safety checks
            if (!patientExists(con, patientId))
                throw new RuntimeException("Invalid patient ID");

            if (!doctorExists(con, doctorId))
                throw new RuntimeException("Invalid or inactive doctor");

            if (!slotAvailable(con, doctorId, date, time))
                throw new RuntimeException("Slot already booked");

            PreparedStatement ps = con.prepareStatement(insertSql);
            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setDate(3, Date.valueOf(date));
            ps.setTime(4, java.sql.Time.valueOf(time));
            ps.setString(5, "scheduled");

            ps.executeUpdate();
        }
    }

    public void cancelAppointment(int appointmentId) throws Exception {
        String sql = "UPDATE appointments SET status='cancelled' WHERE appointment_id=?";

        try (Connection con =DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);
            ps.executeUpdate();
        }
    }

    public void rescheduleAppointment(int appointmentId, int doctorId,
                                      LocalDate date, LocalTime time) throws Exception {

        String updateSql =
            "UPDATE appointments SET doctor_id=?,appointment_date=?,appointment_time=? WHERE appointment_id=?";

        try (Connection con = DatabaseConnection.getConnectionNow()) {

            if (!doctorExists(con, doctorId))
                throw new RuntimeException("Invalid doctor");

            if (!slotAvailable(con, doctorId, date, time))
                throw new RuntimeException("Slot conflict");

            PreparedStatement ps = con.prepareStatement(updateSql);
            ps.setInt(1, doctorId);
            ps.setDate(2, Date.valueOf(date));
            ps.setTime(3, java.sql.Time.valueOf(time));
            ps.setInt(4, appointmentId);

            ps.executeUpdate();
        }
    }
}
