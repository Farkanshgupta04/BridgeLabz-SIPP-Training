package OOPS.Constructors;

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Anonymous";
        price = 0.0;
    }

    
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " by " + author + ", ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Atomic Habits", "James Clear", 499);
        b1.display();
        b2.display();
    }
}
