package za.ac.cput.dogparlor.repository;

/*
     FacilityLocationRepository.java
     Repository for the FacilityLocation
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

import za.ac.cput.dogparlor.domain.FacilityLocation;

import java.util.HashSet;
import java.util.Set;

public class FacilityLocationRepository implements IFacilityLocationRepository {

    static FacilityLocationRepository facilityLocationRepository = null;
    private Set<FacilityLocation> DB = null;

    private FacilityLocationRepository() {
        DB = new HashSet<>();
    }

    public static FacilityLocationRepository getFacilityLocationRepository() {
        if (facilityLocationRepository == null)
            facilityLocationRepository = new FacilityLocationRepository();
        return facilityLocationRepository;
    }

    @Override
    public FacilityLocation create(FacilityLocation facilityLocation) {
        boolean success = DB.add(facilityLocation);

        if (!success)
            return null;

        return facilityLocation;
    }

    @Override
    public FacilityLocation read(Integer id) {
        return DB.stream()
                .filter( e -> e.getFacilityID() == id || e.getLocationID() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public FacilityLocation update(FacilityLocation facilityLocation) {
        FacilityLocation oldFacilityLocation1 = read(facilityLocation.getFacilityID());

        if (oldFacilityLocation1 != null) {
            DB.remove(oldFacilityLocation1);
            DB.add(facilityLocation);
            return facilityLocation;
        }

        return null;
    }

    @Override
    public boolean delete(Integer id) {
        FacilityLocation oldFacilityLocation1 = read(id);

        if (oldFacilityLocation1 == null)
            return false;

        return DB.remove(oldFacilityLocation1);
    }

    @Override
    public Set<FacilityLocation> getAllFacilityLocations() {
        return DB;
    }

}
