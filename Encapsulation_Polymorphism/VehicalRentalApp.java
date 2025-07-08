abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String number, String type, double rate) {
        super(number, type, rate);
    }

    public double calculateRentalCost(int days) {
        return days * 1000;
    }

    public double calculateInsurance() {
        return 5000;
    }

    public String getInsuranceDetails() {
        return "Full Coverage Insurance";
    }
}

public class VehicleRentalApp {
    public static void main(String[] args) {
        Vehicle v = new Car("UP16 3456", "Sedan", 1000);
        System.out.println("Rental Cost for 5 days: ₹" + v.calculateRentalCost(5));
        System.out.println(((Insurable) v).getInsuranceDetails());
        System.out.println("Insurance Cost: ₹" + ((Insurable) v).calculateInsurance());
    }
}