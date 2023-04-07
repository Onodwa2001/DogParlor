/*ICustomerServiceRepository.java
  Interface for the Customer Service
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.CustomerService;

import java.util.Set;

public interface ICustomerServiceRepository extends IRepository<CustomerService, Integer>{

    Set<CustomerService> getAllCustomerServices();
}
