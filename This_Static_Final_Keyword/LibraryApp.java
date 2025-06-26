package OOPS.This_Static_Final_Keyword;

class Book {
    static String libraryName = "Knowledge Hub";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}


public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", "978-0735211292");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", "978-0061122415");

        Book.displayLibraryName();
        System.out.println("-----");
        book1.displayDetails();
        System.out.println("-----");
        book2.displayDetails();
    }
}