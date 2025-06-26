package OOPS.This_Static_Final_Keyword;

class Product {
    static double discount = 10.0; 

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Current Discount: " + discount + "%");
            System.out.println("Price after Discount: ₹" + (price - (price * discount / 100)));
        }
    }
}


public class ShoppingApp {
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Wireless Mouse", 699.00, 2);
        Product prod2 = new Product(102, "USB-C Adapter", 499.00, 1);

        prod1.displayDetails();
        System.out.println("-----");
        prod2.displayDetails();

       
        Product.updateDiscount(15.0);
        System.out.println("-----");

        prod1.displayDetails();
    }
}