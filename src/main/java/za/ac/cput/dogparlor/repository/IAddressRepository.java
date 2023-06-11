/* IAddressRepository.java
  Interface Repository for Address entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Address;


import java.util.Set;

public interface IAddressRepository extends IRepository<Address, Integer> {
    Set<Address> getAllAddress();
}
