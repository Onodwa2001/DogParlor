/* StaffServiceRepository.java
  Repository for StaffService entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.StaffService;

import java.util.HashSet;
import java.util.Set;

public class StaffServiceRepository implements IStaffServiceRepository {
    static StaffServiceRepository staffServiceRepository = null;
    Set<StaffService> DB = null;

    private StaffServiceRepository() {
        DB = new HashSet<>();
    }

    public static StaffServiceRepository getStaffServiceRepository() {
        if (staffServiceRepository == null) {
            staffServiceRepository = new StaffServiceRepository();
        }
        return staffServiceRepository;
    }

    @Override
    public StaffService create(StaffService staffService) {
        boolean success = DB.add(staffService);

        if (!success) {
            return null;
        }

        return staffService;
    }

    @Override
    public StaffService read(Integer id) {
        return DB.stream()
                .filter( staffService -> staffService.getStaffID() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public StaffService update(StaffService staffService) {
        StaffService oldStaffService = read(staffService.getStaffID());

        if (oldStaffService == null) {
            return null;
        }

        boolean successDelete = DB.remove(oldStaffService);
        if (!successDelete)
            return null;

        boolean successAdd = DB.add(staffService);
        if (!successAdd)
            return null;

        return staffService;
    }

    @Override
    public boolean delete(Integer id) {
        StaffService oldStaffService = read(id);

        if (oldStaffService == null) {
            return false;
        }

        return DB.remove(oldStaffService);
    }

    @Override
    public Set<StaffService> getAllStaffService() {
        return DB;
    }

}
