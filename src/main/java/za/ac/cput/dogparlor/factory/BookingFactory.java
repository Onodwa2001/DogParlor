/* BookingFactory.java
   Factory for the Booking entity
   Author: Uthimna Sisipho Rubushe (221044329)
   Date:08 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.util.Helper;

public class BookingFactory {
    public static Booking createBooking(int bookingID, String date , String time, String service, float total) {
        if (bookingID == 0)
            return null;

        if (Helper.isNullOrEmpty(time) || Helper.isNullOrEmpty(service))

            return null;

        return new Booking.BookingBuilder()
                .setBookingID(bookingID)
                .setDate(date)
                .setTime(time)
                .setService(service)
                .setTotal(total)
                .build();
    }
}
