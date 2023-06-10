package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.CustomerAddress;

import java.util.Set;

public interface CustomerAddressService extends IService<CustomerAddress, Integer> {

    Set<CustomerAddress> getAll();

}
