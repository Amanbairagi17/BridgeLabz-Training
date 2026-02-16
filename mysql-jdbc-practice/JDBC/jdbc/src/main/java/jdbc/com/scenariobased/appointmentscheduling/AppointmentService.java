package jdbc.com.scenariobased.appointmentscheduling;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentService {

    private final AppointmentDao dao = new AppointmentDao();

    public void bookAppointment() throws Exception {
        dao.bookAppointment(
            1,                                // patient_id (must exist)
            1,                                // doctor_id (must exist & active)
            LocalDate.of(2026, 3, 1),
            LocalTime.of(10, 0)
        );
        System.out.println("Appointment booked successfully");
    }

    public void cancelAppointment() throws Exception {
        dao.cancelAppointment(1);
        System.out.println("Appointment cancelled");
    }

    public void rescheduleAppointment() throws Exception {
        dao.rescheduleAppointment(
            2,
            2,
            LocalDate.of(2026, 3, 5),
            LocalTime.of(11, 0)
        );
        System.out.println("Appointment rescheduled");
    }
}
