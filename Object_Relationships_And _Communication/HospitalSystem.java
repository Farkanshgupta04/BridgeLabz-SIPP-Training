import java.util.*;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println("Patient: " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showMembers() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
        System.out.println("Patients at " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital fortis = new Hospital("Fortis Healthcare");

        Doctor drAsha = new Doctor("Asha Mehta");
        Doctor drRahul = new Doctor("Rahul Desai");

        Patient rina = new Patient("Rina");
        Patient omkar = new Patient("Omkar");

        fortis.addDoctor(drAsha);
        fortis.addDoctor(drRahul);

        fortis.addPatient(rina);
        fortis.addPatient(omkar);

        drAsha.consult(rina);
        drAsha.consult(omkar);
        drRahul.consult(rina);

        System.out.println();
        drAsha.showPatients();
        System.out.println();
        rina.showDoctors();
    }
}