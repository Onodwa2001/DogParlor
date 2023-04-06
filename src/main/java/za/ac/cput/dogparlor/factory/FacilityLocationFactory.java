package za.ac.cput.dogparlor.factory;

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
