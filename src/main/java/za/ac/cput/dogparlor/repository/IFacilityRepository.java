/*IFacilityRepository.java
  Interface for the Facility
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Facility;

import java.util.Set;

public interface IFacilityRepository extends IRepository<Facility, Integer> {

    Set<Facility> getAllFacilities();
}
