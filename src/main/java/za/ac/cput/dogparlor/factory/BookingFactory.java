package za.ac.cput.dogparlor.factory;


import za.ac.cput.dogparlor.domain.Booking;

public class BookingFactory {

    public static Booking createBooking(int bookingID, int date , int time , int service , int total){
        if (bookingID == 0 || total == 0)
        return null;

        return new Booking.BookingBuilder()
                .setBookingID (bookingID)
                .setDate(date)
                .setTime(time)
                .setTotal(total)
                .build();
    }
}
