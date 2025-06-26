package OOPS.Class_and_Objects.Level-02;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movie, String seat, double cost) {
        movieName = movie;
        seatNumber = seat;
        price = cost;
        System.out.println("Ticket Booked!");
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", "B12", 250);
        ticket.displayDetails();
    }
}
