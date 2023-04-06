package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.FacilityLocation;
import za.ac.cput.dogparlor.domain.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocationFactoryTest {

    @Test
    public void testObject() {
        Location location = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");
        assertNotNull(location);
    }

    @Test
    public void objectEquality() {
        Location location = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");
        Location location2 = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");
        assertEquals(location, location2);
    }

    @Test
    public void objectIdentity() {
        Location location = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Location location2 = location;
        assertSame(location, location2);
    }

    @Test
    public void failingTest() {
        Location location = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");
        Location location2 = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");
        assertSame(location, location2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Location location = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");

        try {
            Thread.sleep(500); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(1232, location.getLocationID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Location location = LocationFactory.createLocation(1232, "Konoha", "-73.0004", "61.9304");
        assertNotNull(location);
    }

}