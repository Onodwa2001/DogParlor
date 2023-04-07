package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.domain.FacilityLocation;
import za.ac.cput.dogparlor.factory.CustomerAddressFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerAddressRepositoryTest {

    private static final CustomerAddressRepository repository = CustomerAddressRepository.getCustomerAddressRepository();
    private static final CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(2322, 5678);

    @Test
    void a_create() {
        CustomerAddress customerAddress1 = repository.create(customerAddress); // created
        System.out.println(customerAddress);
        assertEquals(customerAddress, customerAddress1);
    }

    @Test
    void b_read() {
        CustomerAddress retrievedCustomerAddress = repository.read(customerAddress.getCustomerID());
        System.out.println(retrievedCustomerAddress);
        assertNotNull(retrievedCustomerAddress);
    }

    @Test
    void c_update() {
        CustomerAddress updated = new CustomerAddress.Builder()
                        .setCustomerID(2322)
                        .setAddressID(5564)
                        .build();

        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        CustomerAddress deleted = repository.delete(customerAddress);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllCustomerAddresses() {
        Set<CustomerAddress> customerAddresses = new HashSet<>();
        System.out.println(customerAddresses);
        assertNotNull(customerAddresses);
    }

}