/* StaffServiceFactoryTest.java
  Factory test case for StaffService entity
  Author: Byron Young (218155077)
  Date:06 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.StaffService;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceFactoryTest {
    @Test
    public void testObject() {
        StaffService staffService = StaffServiceFactory.createStaffService(101 , 255);
        assertNotNull(staffService);
    }

    @Test
    public void objectEquality() {
        StaffService staffService = StaffServiceFactory.createStaffService(101 , 255);
        StaffService staffService2 = StaffServiceFactory.createStaffService(101 , 255);
        assertEquals(staffService, staffService2);
    }

    @Test
    public void objectIdentity() {
        StaffService staffService = StaffServiceFactory.createStaffService(101, 255);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        StaffService staffService2 = staffService;
        assertSame(staffService, staffService2);
    }

    @Test
    public void failingTest() {
        StaffService staffService = StaffServiceFactory.createStaffService(101, 255);
        StaffService staffService2 = StaffServiceFactory.createStaffService(101, 255);
        assertSame(staffService, staffService2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        StaffService staffService = StaffServiceFactory.createStaffService(101, 255);

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(101, staffService.getStaffID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        StaffService staffService = StaffServiceFactory.createStaffService(1122, 3344);
        assertNotNull(staffService);
    }

}