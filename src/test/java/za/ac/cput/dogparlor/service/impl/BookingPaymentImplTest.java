package za.ac.cput.dogparlor.service.impl;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.BookingPayment;
import za.ac.cput.dogparlor.factory.BookingPaymentFactory;
import za.ac.cput.dogparlor.service.BookingPaymentService;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.class)
class BookingPaymentServiceImplTest {

    private BookingPaymentService service = null;
    private BookingPayment bookingPayment = BookingPaymentFactory.createBookingPayment(7220, 978);

    @Test
    void a_create() {
        BookingPayment bookingPayment1 = service.create(bookingPayment);
        assertNotNull(bookingPayment1);
        System.out.println("Created: " + bookingPayment1);
    }

    @Test
    void b_read() {
        BookingPayment bookingPayment1 = service.read(bookingPayment.getBookingID());
        assertNotNull(bookingPayment1);
        System.out.println("Read: " + bookingPayment1);
    }

    @Test
    void c_update() {
        BookingPayment bookingPayment1 = new BookingPayment.Builder().copy(bookingPayment)
                .setBookingID(3762)
                .build();
        BookingPayment updated = service.update(bookingPayment1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = service.delete(bookingPayment.getBookingID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<BookingPayment> payments = service.getAllBookingPayments();
        assertNotNull(payments);
        System.out.println("All items: " + payments);
    }

}

