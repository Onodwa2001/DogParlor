/* StaffService.java
  Service for Staff entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */

package za.ac.cput.dogparlor.service;
import za.ac.cput.dogparlor.domain.Staff;

import java.util.Set;

public interface StaffService {

    Staff create(Staff staff);

    Staff read(Integer id);

    Staff update(Staff staff);

    boolean delete(Integer id);
    Set<Staff> getAll();
}
