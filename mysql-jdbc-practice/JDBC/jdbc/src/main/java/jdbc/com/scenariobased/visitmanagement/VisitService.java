package jdbc.com.scenariobased.visitmanagement;

import java.time.LocalDate;
import java.util.List;

public class VisitService {

    private final VisitDao dao = new VisitDao();

    public void recordVisit() throws Exception {
        dao.recordVisit(
            1,                          // appointment_id
            1,                          // patient_id
            "Dr. Aman",
            "Viral Fever",
            "Paracetamol 500mg",
            LocalDate.now()
        );
        System.out.println("Visit recorded & appointment completed");
    }

    public void viewHistory() throws Exception {
        dao.viewMedicalHistory(1);
    }

    public void addPrescription() throws Exception {
        dao.addPrescriptions(
            1,  // visit_id
            List.of(
                new String[]{"Paracetamol", "500mg", "5 days"},
                new String[]{"Vitamin C", "1000mg", "7 days"}
            )
        );
        System.out.println("Prescriptions added");
    }
}
