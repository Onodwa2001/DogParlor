/* StaffFactoryTest.java
  Factory test case for Staff entity
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.domain.Staff;


import static org.junit.jupiter.api.Assertions.*;

class StaffFactoryTest {

    @Test
    public void testObject() {
        Staff staff = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        assertNotNull(staff);
    }

    @Test
    public void objectEquality() {
        Staff staff = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        Staff staff2 = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        assertEquals(staff, staff2);
    }

    @Test
    public void objectIdentity() {
        Staff staff = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Staff staff2 = staff;
        assertSame(staff, staff2);
    }

    @Test
    public void failingTest() {
        Staff staff = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        Staff staff2 = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        assertSame(staff, staff2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Staff staff = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(101, staff.getStaffID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Staff staff = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        assertNotNull(staff);
    }

}