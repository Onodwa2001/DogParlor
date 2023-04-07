package za.ac.cput.dogparlor.factory;


import za.ac.cput.dogparlor.domain.Booking;

import java.util.Date;

public class BookingFactory {

    public static Booking createBooking(int bookingID, Date date , String time , String service , int total){
        if (bookingID == 0 || total == 0)
        return null;

        return new Booking.BookingBuilder()
                .setBookingID (bookingID)
                .setDate(date)
                .setTime(time)
                .setService(service)
                .setTotal(total)
                .build();
    }
}
