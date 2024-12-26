package hospitalmanagementsytem;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create some doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Neurology");

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Create some patients
        Patient patient1 = new Patient("Alice", 30, "No prior medical history");
        Patient patient2 = new Patient("Bob", 40, "Hypertension");

        // Main menu loop
        while (true) {
            System.out.println("\n=== Hospital Appointment System ===");
            System.out.println("1. Book an Appointment");
            System.out.println("2. View Doctor's Appointments");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    // Book an appointment
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Appointment Date and Time (YYYY-MM-DDTHH:MM): ");
                    String dateTimeStr = scanner.nextLine();
                    LocalDateTime appointmentTime = LocalDateTime.parse(dateTimeStr);

                    // Find the patient by name
                    Patient patient = null;
                    if (patientName.equals(patient1.getName())) {
                        patient = patient1;
                    } else if (patientName.equals(patient2.getName())) {
                        patient = patient2;
                    }

                    if (patient != null) {
                        hospital.bookAppointment(patient, doctorName, appointmentTime);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 2:
                    // View appointments for a doctor
                    System.out.print("Enter Doctor's Name to view appointments: ");
                    String docName = scanner.nextLine();
                    Doctor doctor = hospital.findDoctorByName(docName);
                    if (doctor != null) {
                        doctor.showAppointments();
                    } else {
                        System.out.println("Doctor not found.");
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}