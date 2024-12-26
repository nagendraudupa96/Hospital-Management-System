package hospitalmanagementsytem;
import java.util.*;

public class Doctor {
    private String name;
    private String department;
    private List<Appointment> appointments;

    public Doctor(String name, String department) {
        this.name = name;
        this.department = department;
        this.appointments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // add appointments to doctor in array list
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // different method to show appointments
    public void showAppointments(){
        if(appointments.isEmpty()) System.out.println("No Appointments yet.");
        else{
            System.out.println("Appointments for Dr. " + name + ":");
            for(Appointment appointment : appointments)
                System.out.println(appointment);
        }
    }
}
