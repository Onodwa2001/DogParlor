package za.ac.cput.dogparlor.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.dogparlor.domain.Location;
import za.ac.cput.dogparlor.repository.LocationRepository;
import za.ac.cput.dogparlor.service.LocationService;

import java.util.Set;

@Service
public class LocationServiceImpl implements LocationService {

    private static LocationServiceImpl locationService = null;
    private LocationRepository locationRepository = null;

    public LocationServiceImpl() {
        locationRepository = LocationRepository.getLocationRepository();
    }

    public static LocationServiceImpl getInstance() {
        if (locationService == null)
            locationService = new LocationServiceImpl();
        return locationService;
    }

    @Override
    public Location create(Location location) {
        return locationRepository.create(location);
    }

    @Override
    public Location read(Integer integer) {
        return locationRepository.read(integer);
    }

    @Override
    public Location update(Location location) {
        return locationRepository.update(location);
    }

    @Override
    public boolean delete(Integer integer) {
        return locationRepository.delete(integer);
    }

    @Override
    public Set<Location> getALlLocations() {
        return locationRepository.getAllLocations();
    }

}
