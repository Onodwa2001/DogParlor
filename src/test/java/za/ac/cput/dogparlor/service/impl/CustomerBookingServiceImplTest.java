package za.ac.cput.dogparlor.service.impl;

/*
     CustomerBookingServiceImpl.java
     Service for the CustomerBooking
     Author: Onodwa Siyotula (220087016)
     Date: 11 June 2023
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerBooking;
import za.ac.cput.dogparlor.factory.CustomerBookingFactory;
import za.ac.cput.dogparlor.service.CustomerAddressService;
import za.ac.cput.dogparlor.service.CustomerBookingService;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
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