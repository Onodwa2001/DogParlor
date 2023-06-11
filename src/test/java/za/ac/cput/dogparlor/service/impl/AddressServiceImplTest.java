/* AddressServiceImplTest.java
  Service test case for Address entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.factory.AddressFactory;
import za.ac.cput.dogparlor.factory.AddressFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressServiceImplTest {

    private AddressServiceImpl addressService = null;
    private Address address = AddressFactory.createAddress(23, "65 Jordan Street", "Cape Town", "Western Cape","7785" , "South Africa");

    @Test
    void a_create() {
        Address Address1 = addressService.create(address);
        assertNotNull(Address1);
        System.out.println("Created: " + Address1);
    }

    @Test
    void b_read() {
        Address Address1 = addressService.read(address.getAddressID());
        assertNotNull(Address1);
        System.out.println("Read: " + Address1);
    }

    @Test
    void c_update() {
        Address Address1 = new Address.Builder().copy(address)
                .setStreetAddress("23 Jordan Street")
                .build();
        Address updated = addressService.update(Address1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = addressService.delete(address.getAddressID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Address> Addresses = addressService.getAll();
        assertNotNull(Addresses);
        System.out.println("All items: " + Addresses);
    }
}