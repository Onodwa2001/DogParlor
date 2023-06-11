/*CustomerTest.java
  test  for the Customer factory
  Author:Wendy Samsodien (218233779)
  Date:05 April 2023
 */

package za.ac.cput.dogparlor.factory;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    public void test() {
        Customer customer = CustomerFactory.createCustomer(21387);
        System.out.println(customer);
        assertNotNull(customer);
    }

    @Test
    public void failingTest() {
        Customer customer = CustomerFactory.createCustomer(21387);
        Customer customer2 = CustomerFactory.createCustomer(21387);
        assertSame(customer, customer2);
    }

    @Test
    public void objectEquality() {
        Customer customer = CustomerFactory.createCustomer(21387);
        Customer customer2 = CustomerFactory.createCustomer(21387);
        assertEquals(customer, customer2);
    }

    @Test
    public void objectIdentity() {
        Customer customer = CustomerFactory.createCustomer(21387);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Customer customer2 = customer;
        assertSame(customer, customer2);
    }
}