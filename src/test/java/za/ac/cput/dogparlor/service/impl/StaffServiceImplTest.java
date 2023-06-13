/* StaffServiceImplTest.java
  Service test case for Staff entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Staff;
import za.ac.cput.dogparlor.factory.StaffFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class StaffServiceImplTest {

    private static StaffServiceImpl StaffService = StaffServiceImpl.getService();
    private Staff Staff = StaffFactory.createStaff(101, 30000,"Mobile grooming van counter",10,252);

    @Test
    void a_create() {
        Staff Staff1 = StaffService.create(Staff);
        assertNotNull(Staff1);
        System.out.println("Created: " + Staff1);
    }

    @Test
    void b_read() {
        Staff Staff1 = StaffService.read(Staff.getStaffID());
        assertNotNull(Staff1);
        System.out.println("Read: " + Staff1);
    }

    @Test
    void c_update() {
        Staff Staff1 = new Staff.Builder().copy(Staff)
                .setHandleArea("Wash and dip")
                .build();
        Staff updated = StaffService.update(Staff1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = StaffService.delete(Staff.getStaffID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Staff> staff = StaffService.getAll();
        assertNotNull(staff);
        System.out.println("All items: " + staff);
    }
}