/*FacilityRepositoryTest.java
  Repository test class for the Facility
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Facility;
import za.ac.cput.dogparlor.factory.FacilityFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
class FacilityRepositoryTest {
    private static final FacilityRepository repository = FacilityRepository.getFacilityRepository();
    private static final Facility facility = FacilityFactory.createFacility(123);

    @Test
    void a_create() {
        Facility createdFacility = repository.create(facility);
        System.out.println(createdFacility);
        assertEquals(facility.getFacilityId(), createdFacility.getFacilityId());
    }

    @Test
    void b_read() {
        Facility retrievedFacility = repository.read(facility.getFacilityId());
        System.out.println(retrievedFacility);
        assertNotNull(retrievedFacility);
    }

    @Test
    void c_update() {
        Facility updated = new Facility.Builder()
                .setFacilityId(123)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        Facility deleted = repository.delete(facility);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllFacilities() {
        Set<Facility> set = repository.getAllFacilities();
        System.out.println(set);
        assertNotNull(set);
    }
}
