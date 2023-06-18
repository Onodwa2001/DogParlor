/* AddressRepository.java
  Repository for Address entity
  Author: Byron Young (218155077)
  Date:10 June 2023
 */
package za.ac.cput.dogparlor.repository;
import za.ac.cput.dogparlor.domain.Address;

import java.util.HashSet;
import java.util.Set;

public class AddressRepository implements IAddressRepository {
    static AddressRepository addressRepository = null;
    Set<Address> DB = null;

    private AddressRepository() {
        DB = new HashSet<>();
    }

    public static AddressRepository getAddressRepository() {
        if (addressRepository == null) {
            addressRepository = new AddressRepository();
        }
        return addressRepository;
    }

    @Override
    public Address create(Address address) {
        boolean success = DB.add(address);

        if (!success) {
            return null;
        }

        return address;
    }

    @Override
    public Address read(Integer id) {
        return DB.stream()
                .filter( address -> address.getAddressID() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public Address update(Address address) {
        Address oldAddress= read(address.getAddressID());

        if (oldAddress == null) {
            return null;
        }

        boolean successDelete = DB .remove(oldAddress);
        if (!successDelete)
            return null;

        boolean successAdd = DB.add(address);
        if (!successAdd)
            return null;

        return address;
    }

    @Override
    public boolean delete(Integer id) {
        Address oldAddress = read(id);

        if (oldAddress == null) {
            return false;
        }

        return DB.remove(oldAddress);
    }

    @Override
    public Set<Address> getAllAddress() {
        return DB;
    }

}
