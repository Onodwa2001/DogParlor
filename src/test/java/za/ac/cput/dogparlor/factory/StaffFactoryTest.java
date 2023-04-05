/* StaffFactoryTest.java
  Factory test case for Staff entity
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.Staff;


import static org.junit.jupiter.api.Assertions.*;

class StaffFactoryTest {

    @Test
    public void testObject() {
        Staff staff = StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
        assertNotNull(staff);
    }

}