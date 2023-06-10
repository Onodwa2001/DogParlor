package za.ac.cput.dogparlor.repository;

/*
     LocationRepository.java
     Repository for the Location
     Author: Onodwa Siyotula (220087016)
     Date: 08 April 2023
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Location;
import za.ac.cput.dogparlor.factory.LocationFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class LocationRepositoryTest {

    private static final LocationRepository repository = LocationRepository.getLocationRepository();
    private static final Location location = LocationFactory.createLocation(2341, "HQ", "-32.9790", "12.4224");

    @Test
    void a_create() {
        Location createdLocation = repository.create(location);
        System.out.println(createdLocation);
        assertEquals(location.getLocationID(), createdLocation.getLocationID());
    }

    @Test
    void b_read() {
        Location retrievedLocation = repository.read(location.getLocationID());
        System.out.println(retrievedLocation);
        assertNotNull(retrievedLocation);
    }

    @Test
    void c_update() {
        Location updated = new Location.LocationBuilder().copy(location)
                .setLongitude("-27.3831")
                .setLatitude("11.2332")
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(location.getLocationID());
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllLocations() {
        Set<Location> set = repository.getAllLocations();
        System.out.println(set);
        assertNotNull(set);
    }
}