import java.util.*;
abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}

class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void addItem(T item) { items.add(item); }

    static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items)
            System.out.println(item);
    }
}