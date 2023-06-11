package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.FacilityLocation;

import java.util.Set;

public interface IFacilityLocationRepository extends IRepository<FacilityLocation, Integer> {

    Set<FacilityLocation> getAllFacilityLocations();

}
