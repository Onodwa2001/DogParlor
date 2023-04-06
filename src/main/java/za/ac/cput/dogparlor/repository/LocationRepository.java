package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Location;

import java.util.HashSet;
import java.util.Set;

public class LocationRepository implements ILocationRepository {

    static LocationRepository locationRepository = null;
    Set<Location> DB = null;

    private LocationRepository() {
        DB = new HashSet<>();
    }

    public static LocationRepository getLocationRepository() {
        if (locationRepository == null) {
            locationRepository = new LocationRepository();
        }
        return locationRepository;
    }

    @Override
    public Location create(Location location) {
        boolean success = DB.add(location);

        if (!success) {
            return null;
        }

        return location;
    }

    @Override
    public Location read(Integer id) {
        return DB.stream()
                .filter( location -> location.getLocationID() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public Location update(Location location) {
        Location oldLocation = read(location.getLocationID());

        if (oldLocation != null) {
            DB.remove(oldLocation);
            DB.add(location);
            return location;
        }

        return null;
    }

    @Override
    public Location delete(Location location) {
        Location oldLocation = read(location.getLocationID());

        if (oldLocation != null) {
            DB.remove(oldLocation);
            return oldLocation;
        }

        return null;
    }

    @Override
    public Set<Location> getAllLocations() {
        return DB;
    }

}
