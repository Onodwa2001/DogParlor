package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.repository.CustomerAddressRepository;
import za.ac.cput.dogparlor.service.CustomerAddressService;

import java.util.Set;

public class CustomerAddressServiceImpl implements CustomerAddressService {

    private static CustomerAddressServiceImpl customerAddressService = null;
    private CustomerAddressRepository customerAddressRepository = null;

    private CustomerAddressServiceImpl() {
        customerAddressRepository = CustomerAddressRepository.getCustomerAddressRepository();
    }

    public static CustomerAddressServiceImpl getInstance() {
        if (customerAddressService == null)
            customerAddressService = new CustomerAddressServiceImpl();
        return customerAddressService;
    }

    @Override
    public CustomerAddress create(CustomerAddress customerAddress) {
        return customerAddressRepository.create(customerAddress);
    }

    @Override
    public CustomerAddress read(Integer integer) {
        return customerAddressRepository.read(integer);
    }

    @Override
    public CustomerAddress update(CustomerAddress customerAddress) {
        return customerAddressRepository.update(customerAddress);
    }

    @Override
    public boolean delete(Integer integer) {
        return customerAddressRepository.delete(integer);
    }

    @Override
    public Set<CustomerAddress> getAll() {
        return customerAddressRepository.getAllCustomerAddresses();
    }

}
