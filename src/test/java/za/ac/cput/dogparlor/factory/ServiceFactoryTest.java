/*ServiceFactoryTest.java
  Test class for the Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.CustomerBooking;
import za.ac.cput.dogparlor.domain.Service;
import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {

    @Test
    public void testObject() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        assertNotNull(service);
    }


    @Test
    public void objectEquality() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        Service service2 = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        assertEquals(service, service2);
    }

    @Test
    public void objectIdentity() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Service service2 = service;
        assertSame(service, service2);
    }

    @Test
    public void failingTest() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        Service service2 = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        assertSame(service, service2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(2321, service.getServiceId());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        assertNotNull(service);
    }

}