package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.CustomerAddress;

import java.util.Set;

public interface ICustomerAddressRepository extends IRepository<CustomerAddress, Integer> {

    Set<CustomerAddress> getAllCustomerAddresses();

}
