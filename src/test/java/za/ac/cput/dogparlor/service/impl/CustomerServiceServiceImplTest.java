package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerService;
import za.ac.cput.dogparlor.factory.CustomerServiceFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerServiceServiceImplTest {
    private CustomerServiceServiceImpl customerServiceService = null;
    private CustomerService customerService = CustomerServiceFactory.createCustomerService(0001, 0002);

    @Test
    void a_create() {
        CustomerService customerService1 = customerServiceService.create(customerService);
        assertNotNull(customerService1);
        System.out.println("Created: " + customerService1);
    }

    @Test
    void b_read() {
        CustomerService customerService1 = customerServiceService.read(customerService.getCustomerId());
        assertNotNull(customerService1);
        System.out.println("Read: " + customerService1);
    }

    @Test
    void c_update() {
        CustomerService customerService1 = new CustomerService.Builder().copy(customerService)
                .setCustomerId(0001)
                .build();
        CustomerService updated = customerServiceService.update(customerService1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = customerServiceService.delete(customerService.getCustomerId());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<CustomerService> customerServices = customerServiceService.getAll();
        assertNotNull(customerServices);
        System.out.println("All items: " + customerServices);
    }
}

