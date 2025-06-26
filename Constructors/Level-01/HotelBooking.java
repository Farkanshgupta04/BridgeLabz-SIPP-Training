package OOPS.Constructors;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

   
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String name, String type, int n) {
        guestName = name;
        roomType = type;
        nights = n;
    }

    HotelBooking(HotelBooking booking) {
        guestName = booking.guestName;
        roomType = booking.roomType;
        nights = booking.nights;
    }

    void display() {
        System.out.println(guestName + " booked " + roomType + " room for " + nights + " nights.");
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Ritika", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.display();
        b2.display();
        b3.display();
    }
}