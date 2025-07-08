abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x" + quantity);
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * 1.1;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% Non-Veg Promo Applied";
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        NonVegItem item = new NonVegItem("Chicken Biryani", 250, 2);
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        double discount = item.applyDiscount();
        System.out.println("Total: ₹" + total + ", After Discount: ₹" + (total - discount));
    }
}