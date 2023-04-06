/* StaffTest.java
  Domain test case for StaffTest entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    @Test
    void testObjectIdentity() {
        Staff staff = new Staff.Builder()
                .setStaffID(101)
                .setSalary(20000)
                .setHandleArea("Mobile grooming van counter")
                .setIdRole(10)
                .setPersonID(252)
                .build();

        Staff staff2 = staff;

        assertSame(staff2, staff);
    }

    @Test
    void testObjectEquality() {
        Staff staff = new Staff.Builder()
                .setStaffID(101)
                .setSalary(20000)
                .setHandleArea("Mobile grooming van counter")
                .setIdRole(10)
                .setPersonID(252)
                .build();

        Staff staff2 = new Staff.Builder()
                .setStaffID(101)
                .setSalary(20000)
                .setHandleArea("Mobile grooming van counter")
                .setIdRole(10)
                .setPersonID(252)
                .build();

        assertEquals(staff, staff2);
    }
}