interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName);
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Rate: ₹" + ratePerKm + "/km");
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

class Car extends RideVehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

class Bike extends RideVehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // 10% cheaper
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

public class RideApp {
    public static void main(String[] args) {
        RideVehicle ride1 = new Car("CAB123", "Karan", 15);
        RideVehicle ride2 = new Bike("BIKE007", "Simran", 10);

        ride1.getVehicleDetails();
        System.out.println("Fare for 10km: ₹" + ride1.calculateFare(10));
        ((GPS) ride1).updateLocation("Connaught Place");
        System.out.println("Current Location: " + ((GPS) ride1).getCurrentLocation());
        System.out.println("---");

        ride2.getVehicleDetails();
        System.out.println("Fare for 10km: ₹" + ride2.calculateFare(10));
        ((GPS) ride2).updateLocation("India Gate");
        System.out.println("Current Location: " + ((GPS) ride2).getCurrentLocation());
    }
}