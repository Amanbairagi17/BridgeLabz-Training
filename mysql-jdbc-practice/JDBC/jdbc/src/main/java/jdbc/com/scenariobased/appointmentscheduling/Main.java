package jdbc.com.scenariobased.appointmentscheduling;

public class Main {

    public static void main(String[] args) {

        AppointmentService service = new AppointmentService();

        try {
            // UC-3.1 Book new appointment
            service.bookAppointment();

            // UC-3.3 Cancel appointment
            service.cancelAppointment();

            // UC-3.4 Reschedule appointment
            service.rescheduleAppointment();

        } catch (Exception e) {
            System.out.println("Operation failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
