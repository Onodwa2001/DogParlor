package za.ac.cput.dogparlor.service.impl;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.BookingPayment;
import za.ac.cput.dogparlor.factory.BookingPaymentFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.class)
class BookingPaymentServiceImplTest {

    private BookingPaymentServiceImplTest bookingPaymentServiceImplTest = null;
    private BookingPayment bookingPayment = BookingPaymentFactory.createBookingPayment(7220, 009);

    @Test
    void a_create() {
        BookingPayment bookingPayment1 = BookingPaymentServiceImplTest.create(bookingPayment);
        assertNotNull(bookingPayment1);
        System.out.println("Created: " + bookingPayment1);
    }

    @Test
    void b_read() {
        BookingPayment bookingPayment1 = bookingPayment.read(bookingPayment.getBookingID());
        assertNotNull(bookingPayment1);
        System.out.println("Read: " + bookingPayment1);
    }

    @Test
    void c_update() {
        BookingPayment bookingPayment1 = new BookingPayment().Builder().copy(bookingPayment)
                .setAddressID(3762)
                .build();
        bookingPayment updated = BookingPaymentServiceImplTest.update(BookingPayment);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = bookingPaymentService.delete(bookingPayment.getBookingID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<BookingPayment> payments = BookingPaymentService.getAll();
        assertNotNull(payments);
        System.out.println("All items: " + BookingPayment);
    }

