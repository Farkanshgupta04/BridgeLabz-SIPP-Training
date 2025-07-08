class Book {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }
}

class Library {
    Book head, tail;

    void addBook(Book b) {
        if (head == null) {
            head = tail = b;
        } else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }

    void removeById(int id) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + temp.title + " - " + (temp.isAvailable ? "Available" : "Checked Out"));
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("[" + temp.bookId + "] " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + (temp.isAvailable ? "Available" : "Out"));
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("[" + temp.bookId + "] " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + (temp.isAvailable ? "Available" : "Out"));
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Clean Code", "Robert C. Martin", "Programming", 1, true));
        lib.addBook(new Book("The Hobbit", "Tolkien", "Fantasy", 2, true));
        lib.addBook(new Book("1984", "George Orwell", "Dystopia", 3, false));

        System.out.println("Library (Forward):");
        lib.displayForward();

        System.out.println("\nUpdating Availability:");
        lib.updateAvailability(3, true);

        System.out.println("\nLibrary (Reverse):");
        lib.displayReverse();

        System.out.println("\nTotal Books: " + lib.countBooks());
    }
}