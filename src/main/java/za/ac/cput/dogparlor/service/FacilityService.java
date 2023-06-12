package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Facility;


import java.util.Set;
public interface FacilityService extends IService<Facility, Integer> {

    Set<Facility> getAll();
}
