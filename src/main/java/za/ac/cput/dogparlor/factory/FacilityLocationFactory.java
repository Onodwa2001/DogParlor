package za.ac.cput.dogparlor.factory;

/*
     FactilityLocationFactory.java
     Factory for the FacilityLocation
     Author: Onodwa Siyotula (220087016)
     Date: 08 April 2023
 */

import za.ac.cput.dogparlor.domain.FacilityLocation;

public class FacilityLocationFactory {

    public static FacilityLocation createFacilityLocation(int facilityID, int locationID) {
        if (facilityID == 0 || locationID == 0)
            return null;

        return new FacilityLocation.FacilityLocationBuilder()
                .setFacilityID(facilityID)
                .setLocationID(locationID)
                .build();
    }

}
