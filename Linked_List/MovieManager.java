class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        next = prev = null;
    }
}

class MovieList {
    Movie head, tail;

    void addAtEnd(Movie m) {
        if (head == null) {
            head = tail = m;
            return;
        }
        tail.next = m;
        m.prev = tail;
        tail = m;
    }

    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                System.out.println(temp.title + " (" + temp.year + ")");
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManager {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addAtEnd(new Movie("Inception", "Nolan", 2010, 8.8));
        list.addAtEnd(new Movie("Interstellar", "Nolan", 2014, 9.0));
        list.addAtEnd(new Movie("Titanic", "Cameron", 1997, 8.0));

        System.out.println("All Movies:");
        list.displayForward();

        System.out.println("\nReverse Order:");
        list.displayReverse();

        System.out.println("\nUpdate Rating:");
        list.updateRating("Titanic", 9.5);
        list.displayForward();
    }
}