/*FacilityRepository.java
  Repository class for the Facility
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.domain.Facility;
import za.ac.cput.dogparlor.domain.Service;

import java.util.HashSet;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository{

    static FacilityRepository facilityRepository = null;

    Set<Facility> DB = null;


    private FacilityRepository() { DB = new HashSet<>();}

    public static FacilityRepository getFacilityRepository() {
        if (facilityRepository == null) {
            facilityRepository = new FacilityRepository();
        }
        return facilityRepository;
    }




    @Override
    public Facility create(Facility facility) {
        boolean success = DB.add(facility);

        if(!success) {
            return null;
        }
        return facility;
    }

    @Override
    public Facility read(Integer integer) {
        return DB.stream()
                .filter(facility -> facility.getFacilityId() == integer)
                .findAny()
                .orElse(null);

    }

    @Override
    public Facility update(Facility facility) {
        Facility oldFacility = read(facility.getFacilityId());

        if (oldFacility == null)
            return null;

        boolean successfulDelete = DB.remove(oldFacility);
        if (!successfulDelete)
            return null;

        boolean successfulAdd = DB.add(facility);
        if (!successfulAdd)
            return null;

        return facility;
    }

    @Override
    public boolean delete(Integer integer) {
        Facility foundFacility = read(integer);

        if (foundFacility == null)
            return false;

        return DB.remove(foundFacility);

    }

    @Override
    public Set<Facility> getAllFacilities() {
        return DB;
    }
}
