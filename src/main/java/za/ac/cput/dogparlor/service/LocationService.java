package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Location;

import java.util.Set;

public interface LocationService extends IService<Location, Integer> {

    Set<Location> getALlLocations();

}
