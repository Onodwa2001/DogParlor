/* StaffServiceServiceImplTest.java
  Service test case for StaffService entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.StaffService;
import za.ac.cput.dogparlor.factory.StaffServiceFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class StaffServiceServiceImplTest {

    private StaffServiceServiceImpl StaffServiceService = null;
    private StaffService StaffService = StaffServiceFactory.createStaffService(101, 255);

    @Test
    void a_create() {
        StaffService staffService = StaffServiceService.create(StaffService);
        assertNotNull(staffService);
        System.out.println("Created: " + staffService);
    }

    @Test
    void b_read() {
        StaffService staffService = StaffServiceService.read(StaffService.getStaffID());
        assertNotNull(staffService);
        System.out.println("Read: " + staffService);
    }

    @Test
    void c_update() {
        StaffService staffService = new StaffService.Builder().copy(StaffService)
                .setServiceID(260)
                .build();
        StaffService updated = StaffServiceService.update(staffService);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = StaffServiceService.delete(StaffService.getStaffID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<StaffService> staffService = StaffServiceService.getAll();
        assertNotNull(staffService);
        System.out.println("All items: " + staffService);
    }
}
