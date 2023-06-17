/* AddressServiceImpl.java
  Service for Address entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.repository.AddressRepository;
import za.ac.cput.dogparlor.repository.StaffRepository;
import za.ac.cput.dogparlor.service.AddressService;

import java.util.Set;
@Service
public class AddressServiceImpl implements AddressService {
    private static AddressServiceImpl service = null;

    private AddressRepository repository = null;

    public AddressServiceImpl() {
        repository = AddressRepository.getAddressRepository();
    }
   /* public AddressServiceImpl(){
        if (repository == null){
            repository = AddressRepository.getAddressRepository();
        }
    }*/

    public static AddressServiceImpl getService(){
        if (service == null)
            service = new AddressServiceImpl();

        return service;
    }

    @Override
    public Address create(Address address) {
        Address created = repository.create(address);
        return created;
    }

    @Override
    public Address read(Integer id) {
        Address readAddress = repository.read(id);
        return readAddress;
    }

    @Override
    public Address update(Address address) {
        Address updated = repository.update(address);
        return updated;
    }

    @Override
    public boolean delete(Integer id) {
        boolean success = repository.delete(id);
        return success;
    }

    @Override
    public Set<Address> getAll() {
        return repository.getAllAddress();
    }

}
