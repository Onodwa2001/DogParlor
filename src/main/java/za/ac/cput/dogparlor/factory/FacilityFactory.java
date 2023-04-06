/*FacilityFactory.java
  Factory class for the Facility
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Facility;

public class FacilityFactory {

    public static Facility createFacility(int facilityId) {
        if (facilityId == 0)
            return null;

        return new Facility.Builder()
                .setFacilityId(facilityId)
                .build();
    }
}
