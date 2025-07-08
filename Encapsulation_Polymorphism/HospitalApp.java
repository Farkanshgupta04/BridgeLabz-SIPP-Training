import java.util.ArrayList;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int stayDays;
    private double costPerDay;
    private ArrayList<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int stayDays, double costPerDay) {
        super(patientId, name, age);
        this.stayDays = stayDays;
        this.costPerDay = costPerDay;
    }

    @Override
    public double calculateBill() {
        return stayDays * costPerDay;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Rahul", 40, 5, 1200);
        Patient p2 = new OutPatient("P002", "Meera", 28, 800);

        MedicalRecord mr1 = (MedicalRecord) p1;
        mr1.addRecord("Appendix surgery completed.");
        mr1.addRecord("Prescribed antibiotics.");

        MedicalRecord mr2 = (MedicalRecord) p2;
        mr2.addRecord("Routine health check-up.");

        p1.getPatientDetails();
        System.out.println("Bill: ₹" + p1.calculateBill());
        mr1.viewRecords();
        System.out.println("---");

        p2.getPatientDetails();
        System.out.println("Bill: ₹" + p2.calculateBill());
        mr2.viewRecords();
    }
}