/* AddressRepositoryTest.java
  Repository testcase for Address entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.factory.AddressFactory;


import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressRepositoryTest {

    private static final AddressRepository repository = AddressRepository.getAddressRepository();
    private static final Address address = AddressFactory.createAddress( 23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");

    @Test
    void a_create() {
        Address createdAddress= repository.create(address);
        System.out.println(createdAddress);
        assertEquals(address.getAddressID(), createdAddress.getAddressID());
    }

    @Test
    void b_read() {
        Address retrievedAddress = repository.read(address.getAddressID());
        System.out.println(retrievedAddress);
        assertNotNull(retrievedAddress);
    }

    @Test
    void c_update() {
        Address updated = new Address.Builder().copy(address)
                .setAddressID(25)
                .setStreetAddress("65 Soccer Street")
                .setCity("Cape Town")
                .setState("Western Cape")
                .setZipCode("7785")
                .setCountry("South Africa")
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(address.getAddressID());
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllAddress() {
        Set<Address> set = repository.getAllAddress();
        System.out.println(set);
        assertNotNull(set);
    }

}