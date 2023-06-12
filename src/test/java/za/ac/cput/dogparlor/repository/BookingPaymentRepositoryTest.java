package za.ac.cput.dogparlor.repository;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.domain.BookingPayment;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.factory.BookingPaymentFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BookingPaymentRepositoryTest {

    private static final BookingPaymentRepository repository = BookingPaymentRepository.getRepository();
    private static final BookingPayment bookingPayment = BookingPaymentFactory.createBookingPayment(89, 90);

    @Test
    void a_create() {
        BookingPayment createdBookingPayment = repository.create(bookingPayment);
        System.out.println(createdBookingPayment);
        assertEquals(bookingPayment.getBookingID(), createdBookingPayment.getBookingID());
    }

    @Test
    void b_read() {
        BookingPayment retrievedBookingPayment = repository.read(bookingPayment.getBookingID());
        System.out.println(retrievedBookingPayment);
        assertNotNull(retrievedBookingPayment);
    }

    @Test
    void c_update() {
        BookingPayment updated = new BookingPayment.Builder().copy(bookingPayment)
                .setBookingID(144)
                .build();

        BookingPayment updatedBookingPayment = repository.update(updated);
        assertNotNull(updatedBookingPayment);
        System.out.println("Updated: " + updatedBookingPayment);
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(bookingPayment.getBookingID());
        assertNotNull(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAllBookingPayments() {
        Set<BookingPayment> set = repository.getAllBookingPayments();
        System.out.println(set);
        assertNotNull(set);
    }

}