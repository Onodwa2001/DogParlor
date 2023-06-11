/* StaffServiceServiceImpl.java
  Service for StaffService entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.repository.StaffServiceRepository;
import za.ac.cput.dogparlor.domain.StaffService;
import za.ac.cput.dogparlor.service.StaffServiceService;

import java.util.Set;

public class StaffServiceServiceImpl implements StaffServiceService {
    private static StaffServiceServiceImpl service = null;

    private StaffServiceRepository repository = null;


    private StaffServiceServiceImpl(){
        if (repository == null){
            repository = StaffServiceRepository.getStaffServiceRepository();
        }
    }

    public static StaffServiceServiceImpl getService(){
        if (service == null){
            service = new StaffServiceServiceImpl();
        }
        return service;
    }

    @Override
    public StaffService create(StaffService staffService) {
        StaffService created = repository.create(staffService);
        return created;
    }

    @Override
    public StaffService read(Integer id) {
        StaffService readStaff = repository.read(id);
        return readStaff;
    }

    @Override
    public StaffService update(StaffService staffService) {
        StaffService updated = repository.update(staffService);
        return updated;
    }

    @Override
    public boolean delete(Integer id) {
        boolean success = repository.delete(id);
        return success;
    }

    @Override
    public Set<StaffService> getAll() {
        return repository.getAllStaffService();
    }


}
