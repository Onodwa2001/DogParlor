/* StaffRepository.java
  Repository for Staff entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Staff;

import java.util.HashSet;
import java.util.Set;

public class StaffRepository implements IStaffRepository {
    static StaffRepository staffRepository = null;
    Set<Staff> DB = null;

    private StaffRepository() {
        DB = new HashSet<>();
    }

    public static StaffRepository getStaffRepository() {
        if (staffRepository == null) {
            staffRepository = new StaffRepository();
        }
        return staffRepository;
    }

    @Override
    public Staff create(Staff staff) {
        boolean success = DB.add(staff);

        if (!success) {
            return null;
        }

        return staff;
    }

    @Override
    public Staff read(Integer id) {
        return DB.stream()
                .filter( staff -> staff.getStaffID() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public Staff update(Staff staff) {
        Staff oldStaff = read(staff.getStaffID());

        if (oldStaff == null) {
            return null;
        }

        boolean successDelete = DB .remove(oldStaff);
        if (!successDelete)
            return null;

        boolean successAdd = DB.add(staff);
        if (!successAdd)
            return null;

        return staff;
    }

    @Override
    public boolean delete(Integer id) {
        Staff oldStaff = read(id);

        if (oldStaff == null) {
            return false;
        }

        return DB.remove(oldStaff);
    }

    @Override
    public Set<Staff> getAllStaff() {
        return DB;
    }


}
