package za.ac.cput.dogparlor.repository;

/*
     CustomerAddressRepository.java
     Repository for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

import za.ac.cput.dogparlor.domain.CustomerAddress;

import java.util.HashSet;
import java.util.Set;

public class CustomerAddressRepository implements ICustomerAddressRepository {

    static CustomerAddressRepository customerAddressRepository = null;
    private Set<CustomerAddress> DB = null;

    private CustomerAddressRepository() {
        DB = new HashSet<>();
    }

    public static CustomerAddressRepository getCustomerAddressRepository() {
        if (customerAddressRepository == null) {
            customerAddressRepository = new CustomerAddressRepository();
        }
        return customerAddressRepository;
    }

    @Override
    public CustomerAddress create(CustomerAddress customerAddress) {
        boolean success = DB.add(customerAddress);

        if (!success) {
            return null;
        }

        return customerAddress;
    }

    @Override
    public CustomerAddress read(Integer id) {
        return DB.stream().filter(e -> e.getAddressID() == id || e.getCustomerID() == id)
                .findAny()
                .orElse(null);
    }

    @Override
    public CustomerAddress update(CustomerAddress customerAddress) {
        CustomerAddress oldCustomerAddress = read(customerAddress.getCustomerID());

        if (oldCustomerAddress != null) {
            DB.remove(oldCustomerAddress);
            DB.add(customerAddress);
            return customerAddress;
        }

        return null;
    }

    @Override
    public boolean delete(Integer id) {
        CustomerAddress foundCustomerAddress = read(id);

        if (foundCustomerAddress == null)
            return false;

        return DB.remove(foundCustomerAddress);
    }

    @Override
    public Set<CustomerAddress> getAllCustomerAddresses() {
        return DB;
    }

}
