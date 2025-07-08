abstract class LibraryItem {
    private String itemId, title, author;

    public LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 14; }

    public void reserveItem() { System.out.println("Book reserved."); }

    public boolean checkAvailability() { return true; }
}

public class LibraryApp {
    public static void main(String[] args) {
        Book b = new Book("B101", "Java Complete", "James Gosling");
        b.getItemDetails();
        System.out.println("Loan duration: " + b.getLoanDuration() + " days");
        b.reserveItem();
    }
}