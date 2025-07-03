import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Vehicle class
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;
    private String insurancePolicyNumber; // Sensitive detail

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // Encapsulated access to insurance policy number
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);
}

// Car subclass
class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Bike subclass
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days > 7) {
            return rentalRate * days * 0.9; 
        }
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.03;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Truck subclass
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        double fixedFee = 50.0;
        return (rentalRate * days) + fixedFee;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.08;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Demo class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 100.0, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE456", 40.0, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK789", 200.0, "TRUCK-INS-003"));

        int rentalDays = 10;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));
            System.out.println("Insurance Cost: $" + v.calculateInsurance());
            System.out.println(v.getInsuranceDetails());
            System.out.println("-----------------------------");
        }
    }
}
