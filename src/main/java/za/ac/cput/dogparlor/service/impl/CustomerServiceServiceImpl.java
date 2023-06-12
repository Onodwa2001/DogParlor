package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.CustomerService;
import za.ac.cput.dogparlor.repository.CustomerServiceRepository;
import za.ac.cput.dogparlor.service.CustomerServiceService;

import java.util.Set;

public class CustomerServiceServiceImpl implements CustomerServiceService {

    private static CustomerServiceServiceImpl customerServiceService = null;
    private CustomerServiceRepository customerServiceRepository = null;

    private CustomerServiceServiceImpl() {
        customerServiceRepository = CustomerServiceRepository.getCustomerServiceRepository();
    }

    public static CustomerServiceServiceImpl getInstance() {
        if (customerServiceService == null)
            customerServiceService = new CustomerServiceServiceImpl();
        return customerServiceService;
    }

    @Override
    public CustomerService create(CustomerService customerService) {
        return customerServiceRepository.create(customerService);
    }

    @Override
    public CustomerService read(Integer integer) {
        return customerServiceRepository.read(integer);
    }

    @Override
    public CustomerService update(CustomerService customerService) {
        return customerServiceRepository.update(customerService);
    }

    @Override
    public boolean delete(Integer integer) {
        return customerServiceRepository.delete(integer);
    }

    @Override
    public Set<CustomerService> getAll() {
        return customerServiceRepository.getAllCustomerServices();
    }
}
