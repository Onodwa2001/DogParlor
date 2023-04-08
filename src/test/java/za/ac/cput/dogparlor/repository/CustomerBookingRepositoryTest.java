package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.domain.CustomerBooking;
import za.ac.cput.dogparlor.factory.CustomerAddressFactory;
import za.ac.cput.dogparlor.factory.CustomerBookingFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerBookingRepositoryTest {

    private static final CustomerBookingRepository repository = CustomerBookingRepository.getCustomerBookingRepository();
    private static final CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(2322, 5678);

    @Test
    void a_create() {
        CustomerBooking customerBooking1 = repository.create(customerBooking); // created
        System.out.println(customerBooking1);
        assertEquals(customerBooking, customerBooking1);
    }

    @Test
    void b_read() {
        CustomerBooking retrievedCustomerBooking = repository.read(customerBooking.getCustomerID());
        System.out.println(retrievedCustomerBooking);
        assertNotNull(retrievedCustomerBooking);
    }

    @Test
    void c_update() {
        CustomerBooking updated = new CustomerBooking.Builder()
                .setCustomerID(2322)
                .setBookingID(5564)
                .build();

        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        CustomerBooking deleted = repository.delete(customerBooking);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllCustomerBooking() {
        Set<CustomerBooking> customerBookings = new HashSet<>();
        System.out.println(customerBookings);
        assertNotNull(customerBookings);
    }

}