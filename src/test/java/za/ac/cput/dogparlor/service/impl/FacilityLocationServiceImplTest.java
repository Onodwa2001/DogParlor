package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.FacilityLocation;
import za.ac.cput.dogparlor.factory.FacilityLocationFactory;
import za.ac.cput.dogparlor.service.FacilityLocationService;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FacilityLocationServiceImplTest {

    private FacilityLocationService facilityLocationService = FacilityLocationServiceImpl.getInstance();
    private FacilityLocation facilityLocation = FacilityLocationFactory.createFacilityLocation(3525, 6532);

    @Test
    void a_create() {
        FacilityLocation facilityLocation1 = facilityLocationService.create(facilityLocation);
        assertNotNull(facilityLocation1);
        System.out.println("Created: " + facilityLocation1);
    }

    @Test
    void b_read() {
        FacilityLocation facilityLocation1 = facilityLocationService.read(facilityLocation.getFacilityID());
        assertNotNull(facilityLocation1);
        System.out.println("Retrieved: " + facilityLocation1);
    }

    @Test
    void c_update() {
        FacilityLocation facilityLocation1 = new FacilityLocation.FacilityLocationBuilder().copy(facilityLocation)
                .setFacilityID(3422)
                .build();

        FacilityLocation updatedFacilityLocation = facilityLocationService.update(facilityLocation1);
        assertNotNull(updatedFacilityLocation);
        System.out.println("Updated: " + updatedFacilityLocation);
    }

    @Test
    void e_delete() {
        boolean deleted = facilityLocationService.delete(facilityLocation.getFacilityID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAllFacilityLocations() {
        Set<FacilityLocation> facilityLocationSet = facilityLocationService.getAllFacilityLocations();
        assertNotNull(facilityLocationSet);
        System.out.println("Äll FacilityLocations: " + facilityLocationSet);
    }

}