package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.FacilityLocation;
import za.ac.cput.dogparlor.repository.FacilityLocationRepository;
import za.ac.cput.dogparlor.service.FacilityLocationService;

import java.util.Set;

public class FacilityLocationServiceImpl implements FacilityLocationService {

    private static FacilityLocationServiceImpl facilityLocationService;
    private FacilityLocationRepository facilityLocationRepository = null;

    public FacilityLocationServiceImpl() {
        facilityLocationRepository = FacilityLocationRepository.getFacilityLocationRepository();
    }

    public static FacilityLocationServiceImpl getInstance() {
        if (facilityLocationService == null)
            facilityLocationService = new FacilityLocationServiceImpl();
        return facilityLocationService;
    }

    @Override
    public FacilityLocation create(FacilityLocation facilityLocation) {
        return facilityLocationService.create(facilityLocation);
    }

    @Override
    public FacilityLocation read(Integer id) {
        return facilityLocationRepository.read(id);
    }

    @Override
    public FacilityLocation update(FacilityLocation facilityLocation) {
        return facilityLocationRepository.update(facilityLocation);
    }

    @Override
    public boolean delete(Integer id) {
        return facilityLocationRepository.delete(id);
    }

    @Override
    public Set<FacilityLocation> getAllFacilityLocations() {
        return facilityLocationRepository.getAllFacilityLocations();
    }

}
