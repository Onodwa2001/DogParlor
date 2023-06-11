/* StaffServiceService.java
  Service for StaffServiceService entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.StaffService;

import java.util.Set;

public interface StaffServiceService {
    StaffService create(StaffService staffService);

    StaffService read(Integer id);

    StaffService update(StaffService staffService);

    boolean delete(Integer id);
    Set<StaffService> getAll();
}
