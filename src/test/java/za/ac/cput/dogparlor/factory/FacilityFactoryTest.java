/*FacilityFactoryTest.java
  Test class for the Facility
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;


import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.CustomerBooking;
import za.ac.cput.dogparlor.domain.Facility;

import static org.junit.jupiter.api.Assertions.*;

class FacilityFactoryTest {

    @Test
    public void testObject() {
        Facility facility = FacilityFactory.createFacility(121);
        assertNotNull(facility);
    }

    @Test
    public void objectEquality() {
        Facility facility = FacilityFactory.createFacility(121);
        Facility facility2 = FacilityFactory.createFacility(121);
        assertEquals(facility, facility2);
    }

    @Test
    public void objectIdentity() {
        Facility facility = FacilityFactory.createFacility(121);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Facility facility2 = facility;
        assertSame(facility, facility2);
    }

    @Test
    public void failingTest() {
        Facility facility = FacilityFactory.createFacility(121);
        Facility facility2 = FacilityFactory.createFacility(121);
        assertSame(facility, facility2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Facility facility = FacilityFactory.createFacility(121);

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(2321, facility.getFacilityId());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Facility facility = FacilityFactory.createFacility(121);
        assertNotNull(facility);
    }
}