package OOPS.Constructors;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            System.out.println("Borrowed: " + title);
            isAvailable = false;
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Alchemist", "Paulo Coelho", 399);
        book.borrowBook();
        book.borrowBook();  // Should show unavailable now
    }
}
