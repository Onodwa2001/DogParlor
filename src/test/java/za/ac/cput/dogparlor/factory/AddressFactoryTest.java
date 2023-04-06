/* AddressFactoryTest.java
  Factory test case for Address entity
  Author: Byron Young (218155077)
  Date:06 April 2023
 */
package za.ac.cput.dogparlor.factory;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Address;


import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {
    @Test
    public void testObject() {
        Address address = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
        assertNotNull(address);
    }

    @Test
    public void objectEquality() {
        Address address = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
        Address address2 = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
        assertEquals(address, address2);
    }

    @Test
    public void objectIdentity() {
        Address address = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Address address2 = address;
        assertSame(address, address2);
    }

    @Test
    public void failingTest() {
        Address address = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
        Address address2 = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
        assertSame(address, address2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Address address  = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(23, address.getAddressID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Address address = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
        assertNotNull(address);
    }
}