package hospitalmanagementsytem;
import java.time.LocalDateTime;
import java.util.*;

public class Hospital {
    private String name;
    private List<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // add doctor to array list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Hospital will store record of doctors
    // check if the doctor exists in the hospital
    public Doctor findDoctorByName(String doctorName){
        for(Doctor doctor : doctors){
            if(doctor.getName().equalsIgnoreCase(doctorName)) return doctor;
        }
        return null;
    }

    // Hospital is responsible for booking appointments
    public void bookAppointment(Patient patient, String doctorName, LocalDateTime dateTime){
        Doctor doctor = findDoctorByName(doctorName);
        if(doctor!=null){
            Appointment appointment = new Appointment(patient, dateTime);
            doctor.addAppointment(appointment);
            System.out.println("Appointment booked successfully for " + patient.getName() + " with Dr." + doctorName + " on " + dateTime);
        }
        else System.out.println("Doctor not found");
    }
}
