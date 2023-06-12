package za.ac.cput.dogparlor.service.impl;

/*
     CustomerAddressServiceImpl.java
     Service for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 11 June 2023
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.factory.CustomerAddressFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerAddressServiceImplTest {

    private CustomerAddressServiceImpl customerAddressService = null;
    private CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(2432, 5332);

    @Test
    void a_create() {
        CustomerAddress customerAddress1 = customerAddressService.create(customerAddress);
        assertNotNull(customerAddress1);
        System.out.println("Created: " + customerAddress1);
    }

    @Test
    void b_read() {
        CustomerAddress customerAddress1 = customerAddressService.read(customerAddress.getCustomerID());
        assertNotNull(customerAddress1);
        System.out.println("Read: " + customerAddress1);
    }

    @Test
    void c_update() {
        CustomerAddress customerAddress1 = new CustomerAddress.Builder().copy(customerAddress)
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