package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerDog;
import za.ac.cput.dogparlor.factory.CustomerDogFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerDogServiceImplTest {

    private CustomerDogServiceImpl customerDogService = null;
    private CustomerDog customerDog = CustomerDogFactory.createCustomerDog(9856, 7854);

    @Test
    void a_create() {
        CustomerDog customerDog1 = customerDogService.create(customerDog);
        assertNotNull(customerDog1);
        System.out.println("Created: " + customerDog1);
    }

    @Test
    void b_read() {
        CustomerDog customerDog1 = customerDogService.read(customerDog.getCustomerID());
        assertNotNull(customerDog1);
        System.out.println("Read: " + customerDog1);
    }

    @Test
    void c_update() {
        CustomerDog customerDog1 = new CustomerDog.Builder().copy(customerDog)
                .setCustomerID(1254)
                .build();
        CustomerDog updated = customerDogService.update(customerDog1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = customerDogService.delete(customerDog.getCustomerID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<CustomerDog> customerDogs = customerDogService.getAll();
        assertNotNull(customerDogs);
        System.out.println("All items: " + customerDogs);
    }
}