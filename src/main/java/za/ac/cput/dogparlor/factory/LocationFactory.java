package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Location;
import za.ac.cput.dogparlor.util.Helper;

public class LocationFactory {

    public static Location createLocation(int locationID, String name, String latitude, String longitude) {
        if (Helper.isValidCoordinate(latitude) || Helper.isNullOrEmpty(name) || locationID == 0)
            return null;

        return new Location.LocationBuilder().setLocationID(locationID)
                .setName(name)
                .setLatitude(latitude)
                .setLongitude(longitude)
                .build();
    }

}
