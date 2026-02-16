package jdbc.com.scenariobased.doctormanagement;

public class DoctorService {

    private final DoctorDao dao = new DoctorDao();

    public void addDoctor() throws Exception {
        Doctor d = new Doctor();
        d.name = "Dr. Aman";
        d.contact = "9999999999";
        d.consultationFee = 800;
        d.specialtyId = 1;

        dao.addDoctor(d);
        System.out.println("Doctor Added");
    }

    public void updateSpecialty() throws Exception {
        dao.updateSpecialty(1, 2);
        System.out.println("Specialty Updated");
    }

    public void viewBySpecialty() throws Exception {
        dao.viewDoctorsBySpecialty("Neurology");
    }

    public void deactivate() throws Exception {
        dao.deactivateDoctor(1);
        System.out.println("Doctor Deactivated");
    }
}
