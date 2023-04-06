package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.CustomerBooking;
import za.ac.cput.dogparlor.domain.Location;

import static org.junit.jupiter.api.Assertions.*;

class CustomerBookingFactoryTest {

    @Test
    public void testObject() {
        CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(2321, 4532);
        assertNotNull(customerBooking);
    }

    @Test
    public void objectEquality() {
        CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(2321, 4532);
        CustomerBooking customerBooking2 = CustomerBookingFactory.createCustomerBooking(2321, 4532);
        assertEquals(customerBooking, customerBooking2);
    }

    @Test
    public void objectIdentity() {
        CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(2321, 4532);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        CustomerBooking customerBooking2 = customerBooking;
        assertSame(customerBooking, customerBooking2);
    }

    @Test
    public void failingTest() {
        CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(2321, 4532);
        CustomerBooking customerBooking2 = CustomerBookingFactory.createCustomerBooking(2321, 4532);
        assertSame(customerBooking, customerBooking2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(2321, 4532);

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(2321, customerBooking.getCustomerID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        CustomerBooking customerBooking = CustomerBookingFactory.createCustomerBooking(2321, 4532);
        assertNotNull(customerBooking);
    }

}