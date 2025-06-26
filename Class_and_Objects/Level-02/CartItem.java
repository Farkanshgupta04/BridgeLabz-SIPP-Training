package OOPS.Class_and_Objects.Level-02;
class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double cost, int qty) {
        itemName = name;
        price = cost;
        quantity = qty;
    }

    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total cost: ₹" + total);
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();
        cart.addItem("Laptop Bag", 1200, 2);
        cart.displayTotalCost();
        cart.removeItem();
    }
}
