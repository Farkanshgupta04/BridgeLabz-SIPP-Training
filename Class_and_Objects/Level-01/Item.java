package OOPS.Class_and_Objects.Level-01;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: ₹" + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 501;
        item.itemName = "Keyboard";
        item.price = 750.0;

        item.displayDetails();
        System.out.println("Total cost for 3 units: ₹" + item.totalCost(3));
    }
}