/* AddressService.java
  Service for Address entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Address;

import java.util.Set;

public interface AddressService extends IService<Address , Integer> {
    Address create(Address address);

   Address read(Integer id);

   Address update(Address address);

   boolean delete(Integer id);
    Set<Address> getAll();
}
