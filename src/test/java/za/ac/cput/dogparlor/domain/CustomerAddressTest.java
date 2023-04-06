package za.ac.cput.dogparlor.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerAddressTest {

    @Test
    void testObjectIdentity() {
        CustomerAddress customerAddress = new CustomerAddress.Builder()
                .setCustomerID(4352)
                .setAddressID(3435)
                .build();

        CustomerAddress customerAddress2 = customerAddress;

        assertSame(customerAddress2, customerAddress);
    }

    @Test
    void testObjectEquality() {
        CustomerAddress customerAddress = new CustomerAddress.Builder()
                .setCustomerID(4352)
                .setAddressID(3435)
                .build();

        CustomerAddress customerAddress2 = new CustomerAddress.Builder()
                .setCustomerID(4352)
                .setAddressID(3435)
                .build();

        assertEquals(customerAddress, customerAddress2);
    }

}