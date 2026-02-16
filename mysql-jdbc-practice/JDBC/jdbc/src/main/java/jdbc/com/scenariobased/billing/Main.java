package jdbc.com.scenariobased.billing;

public class Main {
    public static void main(String[] args) {

        BillingService service = new BillingService();

        try {
            service.generateBillAndPay();
        } catch (Exception e) {
            System.out.println("Operation failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
