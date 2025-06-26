package OOPS.This_Static_Final_Keyword;

class Vehicle {
    static double registrationFee = 5000.00;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

   
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }
}
public class VehicleApp {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aman Singh", "Sedan", "UP32AB1234");
        Vehicle v2 = new Vehicle("Sneha Rao", "Scooter", "MH12CD5678");

        v1.displayDetails();
        System.out.println("-----");
        v2.displayDetails();

     
        Vehicle.updateRegistrationFee(5500.00);
        System.out.println("-----");

        v1.displayDetails();
    }
}