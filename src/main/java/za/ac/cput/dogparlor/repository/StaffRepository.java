/* StaffRepository.java
  Repository for Staff entity
  Author: Byron Young (218155077)
  Date:07 April 2023
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

        if (oldStaff != null) {
            DB.remove(oldStaff);
            DB.add(staff);
            return staff;
        }

        return null;
    }

    @Override
    public Staff delete(Staff staff) {
        Staff oldStaff = read(staff.getStaffID());

        if (oldStaff != null) {
            DB.remove(oldStaff);
            return oldStaff;
        }

        return null;
    }

    @Override
    public Set<Staff> getAllStaff() {
        return DB;
    }


}
