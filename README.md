Patient.java
contains all the patient details - name, age and medical history(if any); a constructor for these 3 fields; and getters for the 3 fields;
using @Override annotation, toString method is overridden to print the patient details

Doctor.java
contains doctor's name, dept and List of appointments; constructors and getters for the same; and methods to add a new appointment + show all the appointments;

Appointment.java
has patient details and date time parameters to book apointments; override toString to print patient details and appointment date time

Hospital.java
has its own name and list of doctors; dd doctor to list; will store record of doctors; is responsible for booking appointments;

Main.java
all the functionality to interact with End User
