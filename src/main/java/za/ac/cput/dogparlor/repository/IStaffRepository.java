/* IStaffRepository.java
  Interface Repository for Staff entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Staff;


import java.util.Set;

public interface IStaffRepository extends IRepository<Staff, Integer> {
    Set<Staff> getAllStaff();
}
