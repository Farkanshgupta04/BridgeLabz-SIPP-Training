abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice() { return price; }

    public String getName() { return name; }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.1; }

    public double calculateTax() { return getPrice() * 0.18; }

    public String getTaxDetails() { return "18% GST applicable"; }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Product p = new Electronics("EL101", "Smartphone", 30000);
        double discount = p.calculateDiscount();
        double tax = ((Taxable) p).calculateTax();
        double finalPrice = p.getPrice() + tax - discount;
        System.out.println(p.getName() + " Final Price: ₹" + finalPrice);
    }
}