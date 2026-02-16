package jdbc.com.scenariobased.visitmanagement;

public class Main {

    public static void main(String[] args) {

        VisitService service = new VisitService();

        try {
            service.recordVisit();      // UC-4.1
            service.addPrescription();  // UC-4.3
            service.viewHistory();      // UC-4.2
        } catch (Exception e) {
            System.out.println("Operation failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
