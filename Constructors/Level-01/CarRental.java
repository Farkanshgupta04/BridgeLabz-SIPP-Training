package OOPS.Constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    void calculateCost() {
        double ratePerDay = 1000.0;
        double total = ratePerDay * rentalDays;
        System.out.println(customerName + " rented " + carModel + " for ₹" + total);
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Faizan", "Swift Dzire", 5);
        rental.calculateCost();
    }
}
