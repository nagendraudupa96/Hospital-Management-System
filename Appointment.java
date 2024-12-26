package hospitalmanagementsytem;
import java.time.LocalDateTime;

public class Appointment {
    private Patient patient;
    private LocalDateTime dateTime;

    public Appointment(Patient patient, LocalDateTime dateTime) {
        this.patient = patient;
        this.dateTime = dateTime;
    }

    public Patient getPatient() {
        return patient;
    }
    
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Appointment for " + patient.getName() + " on " + dateTime;
    }
}
