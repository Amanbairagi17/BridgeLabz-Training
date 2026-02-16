package jdbc.com.scenariobased.doctormanagement;

public class Main {

    public static void main(String[] args) throws Exception {

        DoctorService service = new DoctorService();

        service.addDoctor();        // UC-2.1
        service.updateSpecialty();  // UC-2.2
        service.viewBySpecialty();  // UC-2.3
        service.deactivate();       // UC-2.4
    }
}
