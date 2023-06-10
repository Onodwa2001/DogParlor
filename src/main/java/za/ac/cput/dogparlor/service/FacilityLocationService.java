package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.FacilityLocation;

import java.util.Set;

public interface FacilityLocationService extends IService<FacilityLocation, Integer> {

    Set<FacilityLocation> getAllFacilityLocations();

}
