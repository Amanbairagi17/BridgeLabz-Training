package jdbc.com.scenariobased.billing;

public class BillingService {

    private final BillingDao dao = new BillingDao();

    public void generateBillAndPay() throws Exception {

        int billId = dao.generateBill(
            1,          // visit_id (must exist)
            1,          // patient_id (must exist)
            "Dr. Aman",
            500,
            100
        );

        System.out.println("Bill generated with ID: " + billId);

        dao.recordPayment(billId, "cash");
        System.out.println("Payment recorded");
    }
}
