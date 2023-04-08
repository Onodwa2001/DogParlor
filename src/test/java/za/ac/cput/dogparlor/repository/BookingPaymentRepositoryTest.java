package za.ac.cput.dogparlor.repository;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.BookingPayment;
import za.ac.cput.dogparlor.factory.BookingPaymentFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BookingPaymentRepositoryTest {

    private static final BookingPaymentRepository repository = BookingPaymentRepository.getRepository();
    private static final BookingPayment bookingPayment = BookingPaymentFactory.createBookingPayment(89,90);

    @Test
    void a_create() {
        BookingPayment createdBookingPayment = repository.create(bookingPayment);
        System.out.println(createdBookingPayment);
        assertEquals(bookingPayment.getBookingID(), createdBookingPayment.getBookingID());
    }

    @Test
    void b_read() {
        BookingPayment retrievedBookingPayment= repository.read(bookingPayment.getBookingID());
        System.out.println(retrievedBookingPayment);
        assertNotNull(retrievedBookingPayment);
    }

    @Test
    void c_update() {
        BookingPayment updated = new BookingPayment.Builder()
                .setBookingID(4234)
                .setPaymentID(2423)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        BookingPayment deleted = repository.delete(bookingPayment);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllBookingPayments() {
        Set<BookingPayment> set = repository.getAllBookingPayments();
        System.out.println(set);
        assertNotNull(set);
    }
}