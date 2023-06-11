package za.ac.cput.dogparlor.service.impl;

import org.junit.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.factory.BookingFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder() (MethodOrderer.MethodName.class)
class BookingServiceImplTest {


    private BookingServiceImpl bookingService = null;
    private Booking booking = BookingFactory.createBooking(2432, 5332);

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
        Booking booking1 = new CustomerAddress.Builder().copy(customerAddress)
                .setAddressID(3762)
                .build();
        CustomerAddress updated = customerAddressService.update(customerAddress1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = customerAddressService.delete(customerAddress.getCustomerID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<CustomerAddress> customerAddresses = customerAddressService.getAll();
        assertNotNull(customerAddresses);
        System.out.println("All items: " + customerAddresses);
    }
}
