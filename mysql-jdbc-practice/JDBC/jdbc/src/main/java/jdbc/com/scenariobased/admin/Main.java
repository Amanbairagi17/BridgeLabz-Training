package jdbc.com.scenariobased.admin;

public class Main {

    public static void main(String[] args) {

        AdminService service = new AdminService();

        try {
            service.manageSpecialties();   // UC-6.1
            service.backupValidation();    // UC-6.2
            service.auditLogs();           // UC-6.3
        } catch (Exception e) {
            System.out.println("Admin operation failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
