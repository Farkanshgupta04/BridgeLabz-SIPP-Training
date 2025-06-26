package OOPS.Class_and_Objects.Level-01;

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "Galaxy M14";
        phone.price = 13999.0;

        phone.displayDetails();
    }
}
