/*IServiceRepository.java
  Interface for the Service
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Service;

import java.util.Set;

public interface IServiceRepository extends IRepository<Service, Integer> {

    Set<Service> getAllServices();

}
