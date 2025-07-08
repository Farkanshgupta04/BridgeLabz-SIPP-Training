class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryList {
    Item head;

    void addAtEnd(Item item) {
        if (head == null) {
            head = item;
        } else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = item;
        }
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println("Found: " + temp.itemName + " Qty: " + temp.quantity + " Price: ₹" + temp.price);
                return;
            }
            temp = temp.next;
        }
    }

    void calculateTotalValue() {
        Item temp = head;
        double total = 0;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + ", Name: " + temp.itemName + ", Qty: " + temp.quantity + ", Price: ₹" + temp.price);
            temp = temp.next;
        }
    }

    void sortByPrice() {
        if (head == null || head.next == null) return;
        for (Item i = head; i.next != null; i = i.next) {
            for (Item j = i.next; j != null; j = j.next) {
                if (i.price > j.price) {
                    double tempPrice = i.price;
                    String tempName = i.itemName;
                    int tempQty = i.quantity, tempId = i.itemId;

                    i.price = j.price;
                    i.itemName = j.itemName;
                    i.quantity = j.quantity;
                    i.itemId = j.itemId;

                    j.price = tempPrice;
                    j.itemName = tempName;
                    j.quantity = tempQty;
                    j.itemId = tempId;
                }
            }
        }
    }
}

public class InventoryApp {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        inventory.addAtEnd(new Item("Monitor", 1, 5, 12000));
        inventory.addAtEnd(new Item("Keyboard", 2, 10, 800));
        inventory.addAtEnd(new Item("Mouse", 3, 20, 400));

        System.out.println("Original Inventory:");
        inventory.display();

        System.out.println("\nSorted by Price:");
        inventory.sortByPrice();
        inventory.display();

        System.out.println("\nTotal Value:");
        inventory.calculateTotalValue();
    }
}