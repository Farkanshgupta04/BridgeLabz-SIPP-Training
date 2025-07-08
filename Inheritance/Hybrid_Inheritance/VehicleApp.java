interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displaySpecs() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    double batteryLevel;

    ElectricVehicle(int maxSpeed, String model, double batteryLevel) {
        super(maxSpeed, model);
        this.batteryLevel = batteryLevel;
    }

    void charge() {
        displaySpecs();
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Charging vehicle...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankLevel;

    PetrolVehicle(int maxSpeed, String model, int fuelTankLevel) {
        super(maxSpeed, model);
        this.fuelTankLevel = fuelTankLevel;
    }

    @Override
    public void refuel() {
        displaySpecs();
        System.out.println("Fuel Tank: " + fuelTankLevel + " liters");
        System.out.println("Refueling vehicle...");
    }
}
public class VehicleApp {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3", 78.5);
        PetrolVehicle pv = new PetrolVehicle(140, "Maruti Swift", 25);

        ev.charge();
        System.out.println("---");
        pv.refuel();
    }
}