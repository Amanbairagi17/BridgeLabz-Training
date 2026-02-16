package jdbc.com.scenariobased.appointmentscheduling;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    public int appointmentId;
    public int patientId;
    public int doctorId;
    public LocalDate date;
    public LocalTime time;
    public String status;
}
