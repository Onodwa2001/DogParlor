package za.ac.cput.dogparlor.service.impl;

/*
     LocationServiceImpl.java
     Service for the Location
     Author: Onodwa Siyotula (220087016)
     Date: 11 June 2023
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Location;
import za.ac.cput.dogparlor.factory.LocationFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class LocationServiceImplTest {

    private LocationServiceImpl locationService = null;
    private Location location = LocationFactory.createLocation(2452, "Town", "-32.049", "21.9382");

    @Test
    void create() {
        Location location1 = locationService.create(location);
        assertNotNull(location1);
        System.out.println("Created: " + location1);
    }

    @Test
    void read() {
        Location location1 = locationService.read(location.getLocationID());
        assertNotNull(location1);
        System.out.println("Read: " + location1);
    }

    @Test
    void update() {
        Location location1 = locationService.update(location);
        assertNotNull(location1);
        System.out.println("Updated: " + location1);
    }

    @Test
    void delete() {
        boolean deleted = locationService.delete(location.getLocationID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void getALlLocations() {
        Set<Location> location1 = locationService.getALlLocations();
        assertNotNull(location1);
        System.out.println("All Locations: " + location1);
    }
}