package jdbc.com.scenariobased.billing;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.com.scenariobased.DatabaseConnection;

public class BillingDao {

     //  UC-5.1 Generate Bill (RETURN GENERATED bill_id)
    public int generateBill(int visitId, int patientId, String doctorName,
                            int consultationFee, int additionalCharges) throws Exception {

        String sql =
            "INSERT INTO bills " +
            "(visit_id, patient_id, doctor_name, consultation_fee, additional_charges, total_amount, bill_date, payment_status) " +
            "VALUES (?, ?, ?, ?, ?, ?, CURDATE(), 'unpaid')";

        int totalAmount = consultationFee + additionalCharges;

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps =
                     con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, visitId);
            ps.setInt(2, patientId);
            ps.setString(3, doctorName);
            ps.setInt(4, consultationFee);
            ps.setInt(5, additionalCharges);
            ps.setInt(6, totalAmount);

            ps.executeUpdate();

            // ✅ Get generated bill_id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                throw new RuntimeException("Bill generation failed");
            }
        }
    }

    //   UC-5.2 Record Payment (TRANSACTION)
    public void recordPayment(int billId, String paymentMode) throws Exception {

        String updateBillSql =
            "UPDATE bills SET payment_status='paid' WHERE bill_id=?";

        String insertPaymentSql =
            "INSERT INTO payment_transactions (bill_id, payment_date, payment_mode) " +
            "VALUES (?, CURDATE(), ?)";

        try (Connection con = DatabaseConnection.getConnectionNow()) {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(updateBillSql);
            ps1.setInt(1, billId);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(insertPaymentSql);
            ps2.setInt(1, billId);
            ps2.setString(2, paymentMode);
            ps2.executeUpdate();

            con.commit();
        }
    }

     //  UC-5.3 View Outstanding Bills
    public void viewOutstandingBills() throws Exception {

        String sql =
            "SELECT p.name, COUNT(b.bill_id) AS total_bills, SUM(b.total_amount) AS total_due " +
            "FROM bills b JOIN patients p ON b.patient_id = p.patient_id " +
            "WHERE b.payment_status = 'unpaid' " +
            "GROUP BY p.patient_id";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                    rs.getString("name") +
                    " | Bills: " + rs.getInt("total_bills") +
                    " | Due: " + rs.getInt("total_due")
                );
            }
        }
    }

    //   UC-5.4 Revenue Report
    public void generateRevenueReport(Date from, Date to) throws Exception {

        String sql =
            "SELECT bill_date, SUM(total_amount) AS revenue " +
            "FROM bills " +
            "WHERE payment_status='paid' AND bill_date BETWEEN ? AND ? " +
            "GROUP BY bill_date " +
            "HAVING SUM(total_amount) > 0";

        try (Connection con = DatabaseConnection.getConnectionNow();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDate(1, from);
            ps.setDate(2, to);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                    rs.getDate("bill_date") +
                    " | Revenue: " + rs.getInt("revenue")
                );
            }
        }
    }
}
