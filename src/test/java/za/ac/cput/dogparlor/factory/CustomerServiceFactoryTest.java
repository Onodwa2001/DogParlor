/*CustomerService.java
  Test class for the Customer Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;


import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.CustomerService;
import za.ac.cput.dogparlor.domain.Facility;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceFactoryTest {
    @Test
    public void testObject() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);
        assertNotNull(customerService);
    }

    @Test
    public void objectEquality() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);
        CustomerService customerService2 = CustomerServiceFactory.createCustomerService(001, 002);
        assertEquals(customerService, customerService2);
    }

    @Test
    public void objectIdentity() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        CustomerService customerService2 = customerService;
        assertSame(customerService, customerService2);
    }

    @Test
    public void failingTest() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);
        CustomerService customerService2 = CustomerServiceFactory.createCustomerService(001, 002);
        assertSame(customerService, customerService2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(2321, customerService.getCustomerId());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);
        assertNotNull(customerService);
    }

}