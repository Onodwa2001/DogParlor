/*CustomerServiceRepositoryTest.java
  Repository test for the Customer Service
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.domain.CustomerService;
import za.ac.cput.dogparlor.factory.CustomerServiceFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerServiceRepositoryTest {

    private static final CustomerServiceRepository repository = CustomerServiceRepository.getCustomerServiceRepository();
    private static final CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);

    @Test
    void a_create() {
        CustomerService createdCustomerService = repository.create(customerService);
        System.out.println(createdCustomerService);
        assertEquals(customerService.getCustomerId(), createdCustomerService.getCustomerId());
    }

    @Test
    void b_read() {
        CustomerService retrievedCustomerService = repository.read(customerService.getCustomerId());
        System.out.println(retrievedCustomerService);
        assertNotNull(retrievedCustomerService);
    }

    @Test
    void c_update() {
        CustomerService updated = new CustomerService.Builder().copy(customerService)
                .setCustomerId(001)
                .setServiceId(002)
                .build();

        CustomerService updatedCustomerService = repository.update(updated);
        assertNotNull(updatedCustomerService);
        System.out.println("Updated: " + updatedCustomerService);
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(customerService.getCustomerId());
        System.out.println(deleted);
        assertTrue(deleted);
    }

    @Test
    void d_getAllCustomerServices() {
        Set<CustomerService> set = repository.getAllCustomerServices();
        System.out.println(set);
        assertNotNull(set);
    }
}
