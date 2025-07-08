class Ticket {
    int ticketId;
    String customerName, movieName, seatNo, time;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNo, String time) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNo = seatNo;
        this.time = time;
    }
}

class TicketSystem {
    Ticket head = null;

    void addTicket(Ticket t) {
        if (head == null) {
            head = t;
            t.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }

    void removeTicket(int ticketId) {
        if (head == null) return;
        if (head.ticketId == ticketId && head.next == head) {
            head = null;
            return;
        }
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (prev != null) prev.next = temp.next;
                else {
                    Ticket last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("Ticket #" + temp.ticketId + " | " + temp.customerName + " | " + temp.movieName + " | Seat: " + temp.seatNo + " | Time: " + temp.time);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByName(String name) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name))
                System.out.println("Found: " + temp.movieName + " - Seat: " + temp.seatNo);
            temp = temp.next;
        } while (temp != head);
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class TicketApp {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        system.addTicket(new Ticket(101, "Arjun", "Jawan", "A1", "6 PM"));
        system.addTicket(new Ticket(102, "Simran", "Jawan", "A2", "6 PM"));
        system.addTicket(new Ticket(103, "Arya", "Barbie", "B1", "9 PM"));

        system.displayTickets();
        System.out.println("\nAfter removing ticket 102:");
        system.removeTicket(102);
        system.displayTickets();

        System.out.println("\nTickets booked: " + system.countTickets());
        system.searchByName("Arya");
    }
}