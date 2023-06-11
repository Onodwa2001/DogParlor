/*CustomerDogFactoryTest.java
  test  for the Customer factory
  Author:Wendy Samsodien (218233779)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.CustomerDog;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDogFactoryTest {

    @Test
    public void test() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963, 36987);
        System.out.println(customerDog);
        assertNotNull(customerDog);
    }
    @Test
    public void failingTest() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963,36987);
        CustomerDog customerDog2 = CustomerDogFactory.createCustomerDog(78963,36987);
        assertSame(customerDog, customerDog2);
    }

    @Test
    public void objectEquality() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963,36987);
        CustomerDog customerDog2 = CustomerDogFactory.createCustomerDog(78963,36987);
        assertEquals(customerDog, customerDog2);
    }
    @Test
    public void objectIdentity() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963,36987);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        CustomerDog customerDog2 = customerDog;
        assertSame(customerDog, customerDog2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963,36987);
        try {
            Thread.sleep(500); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(78963, customerDog.getCustomerID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
    @Ignore
    @Test
    public void ignoreThisTest() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963,36987);
        assertNotNull(customerDog);
    }

}


