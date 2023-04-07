/* AddressRepository.java
  Repository for Address entity
  Author: Byron Young (218155077)
  Date:07 April 2023
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

        if (oldAddress != null) {
            DB.remove(oldAddress);
            DB.add(address);
            return address;
        }

        return null;
    }

    @Override
    public Address delete(Address address) {
        Address oldAddress = read(address.getAddressID());

        if (oldAddress != null) {
            DB.remove(oldAddress);
            return oldAddress;
        }

        return null;
    }

    @Override
    public Set<Address> getAllAddress() {
        return DB;
    }

}
