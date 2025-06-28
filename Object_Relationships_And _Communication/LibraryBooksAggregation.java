import java.util.ArrayList;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            b.displayInfo();
        }
    }
}

public class LibraryBooksAggregation {
    public static void main(String[] args) {
        
        Book book1 = new Book("Java Fundamentals", "Sunil Kumar");
        Book book2 = new Book("Data Structures", "Nina Gupta");
        Book book3 = new Book("Clean Code", "Robert C. Martin");

       
        Library libA = new Library("City Library");
        Library libB = new Library("Tech Library");

       
        libA.addBook(book1);
        libA.addBook(book2);

        libB.addBook(book2); 
        libB.addBook(book3);

       
        libA.showBooks();
        System.out.println();
        libB.showBooks();
    }
}