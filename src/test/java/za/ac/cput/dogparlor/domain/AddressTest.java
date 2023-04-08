/* AddressTest.java
  Domain test case for AddressTest entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    @Test
    void testObjectIdentity() {
        Address address = new Address.Builder()
                .setAddressID(23)
                .setStreetAddress("65 Soccer Street")
                .setCity("Cape Town")
                .setState("Western Cape")
                .setZipCode("7785")
                .setCountry("South Africa")
                .build();

        Address address2 = address;

        assertSame(address2, address);
    }

    @Test
    void testObjectEquality() {
        Address address = new Address.Builder()
                .setAddressID(23)
                .setStreetAddress("65 Soccer Street")
                .setCity("Cape Town")
                .setState("Western Cape")
                .setZipCode("7785")
                .setCountry("South Africa")
                .build();

        Address address2 = new Address.Builder()
                .setAddressID(23)
                .setStreetAddress("65 Soccer Street")
                .setCity("Cape Town")
                .setState("Western Cape")
                .setZipCode("7785")
                .setCountry("South Africa")
                .build();

        assertEquals(address, address2);
    }
}