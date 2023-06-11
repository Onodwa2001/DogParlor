package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Customer;
import za.ac.cput.dogparlor.factory.CustomerFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerServiceImplTest {

    private CustomerServiceImpl customerService = null;
    private Customer customer = CustomerFactory.createCustomer(5332);

    @Test
    void a_create() {
        Customer customer1 = customerService.create(customer);
        assertNotNull(customer1);
        System.out.println("Created: " + customer1);
    }

    @Test
    void b_read() {
        Customer customer1 = customerService.read(customer.getCustomerID());
        assertNotNull(customer1);
        System.out.println("Read: " + customer1);
    }

    @Test
    void c_update() {
        Customer customer1 = new Customer.Builder().copy(customer)
                .setCustomerID(1452)
                .build();
        Customer updated = customerService.update(customer1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = customerService.delete(customer.getCustomerID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Customer> customers = customerService.getAll();
        assertNotNull(customers);
        System.out.println("All items: " + customers);
    }
}
