/*FacilityFactoryTest.java
  Test class for the Facility
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.Facility;

import static org.junit.jupiter.api.Assertions.*;

class FacilityFactoryTest {

    @Test
    public void test() {
        Facility facility = FacilityFactory.createFacility(121);
        System.out.println(facility.toString());
        assertNotNull(facility);
    }
}