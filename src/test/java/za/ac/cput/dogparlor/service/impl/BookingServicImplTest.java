package za.ac.cput.dogparlor.service.impl;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.factory.BookingFactory;

import java.util.Date;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.class)
class BookingServiceImplTest {


    private BookingServiceImpl bookingService = null;

    private Booking booking = BookingFactory.createBooking(6789, new Date(), "15:20", "wash", 365);

    @Test
    void a_create() {
        Booking booking1 = bookingService.create(booking);
        assertNotNull(booking1);
        System.out.println("Created: " + booking1);
    }

    @Test
    void b_read() {
        Booking booking1 = bookingService.read(booking.getBookingID());
        assertNotNull(booking1);
        System.out.println("Read: " + booking1);
    }

    @Test
    void c_update() {
        Booking booking1 = new Booking.BookingBuilder().copy(booking)
                .setBookingID(546)
                .build();
        Booking updated = bookingService.update(booking1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = bookingService.delete(booking.getBookingID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Booking> bookings=bookingService.getAllBookings();
        assertNotNull(bookings);
        System.out.println("All items: " + bookings);
    }
}
