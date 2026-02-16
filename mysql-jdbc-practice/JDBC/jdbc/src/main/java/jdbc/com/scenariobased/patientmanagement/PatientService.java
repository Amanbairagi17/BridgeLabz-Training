package jdbc.com.scenariobased.patientmanagement;

import java.time.LocalDate;
import java.util.List;

public class PatientService {

    private final PatientDao dao = new PatientDao();

    public void register() throws Exception {
        Patient p = new Patient();
        p.name = "Aman Bairagi";
        p.dob = LocalDate.of(2001, 5, 12);
        p.phone = "9999999999";
        p.email = "aman999@gmail.com";
        p.address = "Indore";
        p.bloodGroup = "B+";

        dao.registerPatient(p);
        System.out.println("Patient Registered");
    }

    public void update() throws Exception {
        dao.updatePatient(1, "Bhopal", "8888888888");
        System.out.println("Patient Updated");
    }

    public void search() throws Exception {
        List<Patient> list = dao.searchByName("Aman");
        list.forEach(p ->
            System.out.println(p.patientId + " " + p.name + " " + p.phone)
        );
    }

    public void visitHistory() throws Exception {
        dao.viewVisitHistory(1);
    }
}
