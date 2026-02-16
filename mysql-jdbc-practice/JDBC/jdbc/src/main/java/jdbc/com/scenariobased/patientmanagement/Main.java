package jdbc.com.scenariobased.patientmanagement;


public class Main{

    public static void main(String[] args) throws Exception {

        PatientService service = new PatientService();

        service.register();      // UC-1.1
        service.update();        // UC-1.2
        service.search();        // UC-1.3
        service.visitHistory();  // UC-1.4
    }
}
