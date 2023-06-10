package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.CustomerBooking;
import za.ac.cput.dogparlor.factory.CustomerBookingFactory;
import za.ac.cput.dogparlor.service.CustomerAddressService;
import za.ac.cput.dogparlor.service.CustomerBookingService;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CustomerBookingServiceImplTest {

    private CustomerBookingService customerBookingService = CustomerBookingServiceImpl.getInstance();
    private CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(3434, 245);

    @Test
    void create() {
        CustomerBooking customerBooking1 = customerBookingService.create(customerBooking);
        assertNotNull(customerBooking1);
        System.out.println("Created: " + customerBooking1);
    }

    @Test
    void read() {
        CustomerBooking customerBooking1 = customerBookingService.read(customerBooking.getCustomerID());
        assertNotNull(customerBooking1);
        System.out.println("Read: " + customerBooking1);
    }

    @Test
    void update() {
        CustomerBooking customerBooking1 = customerBookingService.update(customerBooking);
        assertNotNull(customerBooking1);
        System.out.println("Updated: " + customerBooking1);
    }

    @Test
    void delete() {
        boolean deleted = customerBookingService.delete(customerBooking.getCustomerID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void getAll() {
        Set<CustomerBooking> customerBookings = customerBookingService.getAll();
        assertNotNull(customerBookings);
        System.out.println("All CustomerBookings: " + customerBookings);
    }

}