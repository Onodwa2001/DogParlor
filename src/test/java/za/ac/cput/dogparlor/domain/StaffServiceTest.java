/* StaffServiceTest.java
  Domain test case for StaffServiceTest entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceTest {

    @Test
    void testObjectIdentity() {
        StaffService staffService = new StaffService.Builder()
                .setStaffID(1122)
                .setServiceID(3344)
                .build();

        StaffService staffService2 = staffService;

        assertSame(staffService2, staffService);
    }

    @Test
    void testObjectEquality() {
        StaffService staffService = new StaffService.Builder()
                .setStaffID(1122)
                .setServiceID(3344)
                .build();

        StaffService staffService2 = new StaffService.Builder()
                .setStaffID(1122)
                .setServiceID(3344)
                .build();

        assertEquals(staffService, staffService2);
    }

}