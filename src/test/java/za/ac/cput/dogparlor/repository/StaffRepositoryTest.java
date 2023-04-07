/* StaffRepositoryTest.java
  Repository testcase for Staff entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Staff;
import za.ac.cput.dogparlor.factory.StaffFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class StaffRepositoryTest {

    private static final StaffRepository repository = StaffRepository.getStaffRepository();
    private static final Staff staff = StaffFactory.createStaff(101, 20000,"Mobile grooming van counter",10,252);

    @Test
    void a_create() {
        Staff createdStaff= repository.create(staff);
        System.out.println(createdStaff);
        assertEquals(staff.getStaffID(), createdStaff.getStaffID());
    }

    @Test
    void b_read() {
        Staff retrievedStaff = repository.read(staff.getStaffID());
        System.out.println(retrievedStaff);
        assertNotNull(retrievedStaff);
    }

    @Test
    void c_update() {
        Staff updated = new Staff.Builder().setStaffID(101)
                .setSalary(20000)
                .setHandleArea("Mobile grooming van counter")
                .setIdRole(10)
                .setPersonID(252)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        Staff deleted = repository.delete(staff);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllStaff() {
        Set<Staff> set = repository.getAllStaff();
        System.out.println(set);
        assertNotNull(set);
    }

}