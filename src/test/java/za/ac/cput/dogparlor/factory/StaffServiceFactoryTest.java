/* StaffServiceFactoryTest.java
  Factory test case for StaffService entity
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.StaffService;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceFactoryTest {
    @Test
    public void testObject() {
        StaffService staffService = StaffServiceFactory.createStaffService(101 , 255);
        assertNotNull(staffService);
    }
}