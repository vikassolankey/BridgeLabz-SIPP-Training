import java.util.ArrayList;
import java.util.List;

// Interface for Medical Records
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

// Abstract Patient class
abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalHistory);
    }

    // Concrete method
    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }

    // Abstract method
    public abstract double calculateBill();
}

// InPatient subclass
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}

// OutPatient subclass
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Main class to demonstrate functionality
public class HospitalManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(1, "Alice", 30, "Appendicitis", 5, 2000.0);
        Patient outPatient = new OutPatient(2, "Bob", 25, "Flu", 500.0);

        inPatient.addRecord("Surgery performed on 2024-06-01");
        outPatient.addRecord("Consultation on 2024-06-02");

        // Polymorphic handling
        Patient[] patients = {inPatient, outPatient};
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Medical History: " + p.viewRecords());
            System.out.println("Bill: " + p.calculateBill());
            System.out.println("-----");
        }
    }
}
