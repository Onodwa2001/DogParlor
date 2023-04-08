package za.ac.cput.dogparlor.repository;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.factory.BookingFactory;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BookingRepositoryTest {

    private static final BookingRepository repository = BookingRepository.getRepository();
    private static final Booking booking = BookingFactory.createBooking(89,90);

    @Test
    void a_create() {
        Booking createdBooking = repository.create(booking);
        System.out.println(createdBooking);
        assertEquals(booking.getBookingID(), createdBooking.getBookingID());
    }

    @Test
    void b_read() {
        Booking retrievedBooking = repository.read(booking.getBookingID());
        System.out.println(retrievedBooking);
        assertNotNull(retrievedBooking);
    }

    @Test
    void c_update() {
        Booking updated = new Booking.BookingBuilder()
                .setBookingID(4234)
                .setDate(new Date())
                .setTime(new Time(new Date().getTime()).toString())
                .setService("Pampering")
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        Booking deleted = repository.delete(booking.getBookingID());
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllBooking() {
        Set<Booking> set = repository.getAllBookings();
        System.out.println(set);
        assertNotNull(set);
    }
}
