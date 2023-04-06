package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Location;

import java.util.Set;

public interface ILocationRepository extends IRepository<Location, Integer> {

    Set<Location> getAllLocations();

}
