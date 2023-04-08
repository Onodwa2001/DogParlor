/* IStaffServiceRepository.java
  Interface Repository for StaffService entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.StaffService;

import java.util.Set;

public interface IStaffServiceRepository extends IRepository<StaffService, Integer> {
    Set<StaffService> getAllStaffService();
}
