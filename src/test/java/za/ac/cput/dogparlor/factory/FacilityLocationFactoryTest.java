package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.FacilityLocation;

import static org.junit.jupiter.api.Assertions.*;

class FacilityLocationFactoryTest {

    @Test
    public void testObject() {
        FacilityLocation facilityLocation = FacilityLocationFactory.createFacilityLocation(1232, 3322);
        assertNotNull(facilityLocation);
    }

    @Test
    public void objectEquality() {
        FacilityLocation facilityLocation = FacilityLocationFactory.createFacilityLocation(2423, 2234);
        FacilityLocation facilityLocation2 = FacilityLocationFactory.createFacilityLocation(2423, 2234);
        assertEquals(facilityLocation, facilityLocation2);
    }

    @Test
    public void objectIdentity() {
        FacilityLocation facilityLocation = FacilityLocationFactory.createFacilityLocation(2423, 2234);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        FacilityLocation facilityLocation2 = facilityLocation;
        assertSame(facilityLocation, facilityLocation2);
    }

    @Test
    public void failingTest() {
        FacilityLocation facilityLocation = FacilityLocationFactory.createFacilityLocation(2423, 2234);
        FacilityLocation facilityLocation2 = FacilityLocationFactory.createFacilityLocation(2423, 2234);
        assertSame(facilityLocation, facilityLocation2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        FacilityLocation facilityLocation = FacilityLocationFactory.createFacilityLocation(2423, 2234);

        try {
            Thread.sleep(500); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(2423, facilityLocation.getFacilityID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        FacilityLocation facilityLocation = FacilityLocationFactory.createFacilityLocation(2423, 2234);
        assertNotNull(facilityLocation);
    }

}