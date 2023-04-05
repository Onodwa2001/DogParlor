package za.ac.cput.dogparlor.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.CustomerAddress;

import static org.junit.jupiter.api.Assertions.*;

class CustomerAddressFactoryTest {

    @Test
    public void testObject() {
        CustomerAddress cust = CustomerAddressFactory.createCustomerAddress(23032, 342);
        assertNotNull(cust);
    }

}