package jdbc.com.scenariobased.admin;

import java.sql.Timestamp;

public class AdminService {

    private final AdminDao dao = new AdminDao();

    public void manageSpecialties() throws Exception {
        dao.addSpecialty("Dermatology");
        dao.updateSpecialty(1, "Cardio");
        // dao.deleteSpecialty(2); // only if not used by doctors
        System.out.println("Specialty operations done");
    }

    public void backupValidation() throws Exception {
        dao.validateSchemaForBackup();
    }

    public void auditLogs() throws Exception {
        dao.viewAuditLogs(
            "admin",
            "appointments",
            Timestamp.valueOf("2024-01-01 00:00:00"),
            Timestamp.valueOf("2026-12-31 23:59:59")
        );
    }
}
