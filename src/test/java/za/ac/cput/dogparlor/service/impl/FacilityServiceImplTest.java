package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Facility;
import za.ac.cput.dogparlor.factory.FacilityFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class FacilityServiceImplTest {

    private FacilityServiceImpl facilityService = null;
    private Facility facility = FacilityFactory.createFacility(2000);

    @Test
    void a_create() {
        Facility facility1 = facilityService.create(facility);
        assertNotNull(facility1);
        System.out.println("Created: " + facility1);
    }

    @Test
    void b_read() {
        Facility facility1 = facilityService.read(facility.getFacilityId());
        assertNotNull(facility1);
        System.out.println("Read: " + facility1);
    }

    @Test
    void c_update() {
        Facility facility1 = new Facility.Builder().copy(facility)
                .setFacilityId(2000)
                .build();
        Facility updated = facilityService.update(facility1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = facilityService.delete(facility.getFacilityId());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Facility> facilities = facilityService.getAll();
        assertNotNull(facilities);
        System.out.println("All items: " + facilities);
    }
}
