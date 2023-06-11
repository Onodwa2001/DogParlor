/* StaffServiceImpl.java
  Service for Staff entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */

package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Staff;
import za.ac.cput.dogparlor.repository.StaffRepository;
import za.ac.cput.dogparlor.service.StaffService;

import java.util.Set;

public class StaffServiceImpl implements StaffService {
    private static StaffServiceImpl service = null;

    private StaffRepository repository = null;


    private StaffServiceImpl(){
        if (repository == null){
            repository = StaffRepository.getStaffRepository();
        }
    }

    public static StaffServiceImpl getService(){
        if (service == null){
            service = new StaffServiceImpl();
        }
        return service;
    }

    @Override
    public Staff create(Staff Staff) {
        Staff created = repository.create(Staff);
        return created;
    }

    @Override
    public Staff read(Integer id) {
        Staff readStaff = repository.read(id);
        return readStaff;
    }

    @Override
    public Staff update(Staff Staff) {
        Staff updated = repository.update(Staff);
        return updated;
    }

    @Override
    public boolean delete(Integer id) {
        boolean success = repository.delete(id);
        return success;
    }

    @Override
    public Set<Staff> getAll() {
        return repository.getAllStaff();
    }
    
    
}
