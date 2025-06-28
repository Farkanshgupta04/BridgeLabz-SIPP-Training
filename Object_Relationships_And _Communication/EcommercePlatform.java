import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order for: " + customer.getName());
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getName() + " ₹" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: ₹" + total);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer maya = new Customer("Maya");

        Product laptop = new Product("Laptop", 60000);
        Product mouse = new Product("Wireless Mouse", 1500);
        Product book = new Product("Java Book", 700);

        Order order1 = new Order(maya);
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = new Order(maya);
        order2.addProduct(book);

        maya.placeOrder(order1);
        maya.placeOrder(order2);

        maya.viewOrders();
    }
}