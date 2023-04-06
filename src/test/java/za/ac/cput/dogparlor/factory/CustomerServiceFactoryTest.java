/*CustomerService.java
  Test class for the Customer Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.CustomerService;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceFactoryTest {
    @Test
    public void test() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService(001, 002);
        System.out.println(customerService.toString());
        assertNotNull(customerService);
    }

    @Test
    public void test_fail() {
        CustomerService customerService = CustomerServiceFactory.createCustomerService( 7, 002);
        System.out.println(customerService.toString());
        assertNotNull(customerService);
    }

}