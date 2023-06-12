package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Facility;
import za.ac.cput.dogparlor.repository.FacilityRepository;
import za.ac.cput.dogparlor.service.FacilityService;

import java.util.Set;

public class FacilityServiceImpl implements FacilityService {

    private static FacilityServiceImpl facilityService = null;
    private FacilityRepository facilityRepository = null;

    private FacilityServiceImpl() {
        facilityRepository = FacilityRepository.getFacilityRepository();
    }

    public static FacilityServiceImpl getInstance() {
        if (facilityService == null)
            facilityService = new FacilityServiceImpl();
        return facilityService;
    }

    @Override
    public Facility create(Facility facility) {
        return facilityRepository.create(facility);
    }

    @Override
    public Facility read(Integer integer) {
            return facilityRepository.read(integer);
    }

    @Override
    public Facility update(Facility facility) {
        return facilityRepository.update(facility);
    }

    @Override
    public boolean delete(Integer integer) {
        return facilityRepository.delete(integer);
    }

    @Override
    public Set<Facility> getAll() {
        return facilityRepository.getAllFacilities();
    }
}
