package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Customer;

import za.ac.cput.dogparlor.repository.CustomerRepository;
import za.ac.cput.dogparlor.service.CustomerService;

import java.util.Set;

public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl customerService = null;
    private CustomerRepository customerRepository = null;

    public CustomerServiceImpl() {
        customerRepository = CustomerRepository.getCustomerRepository();
    }

    public static CustomerServiceImpl getInstance() {
        if (customerService == null)
            customerService = new CustomerServiceImpl();
        return customerService;
    }

    @Override
    public Customer create(Customer customer) {
        return customerRepository.create(customer);
    }

    @Override
    public Customer read(Integer integer) {
        return customerRepository.read(integer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.update(customer);
    }

    @Override
    public boolean delete(Integer integer) {
        return customerRepository.delete(integer);
    }

    @Override
    public Set<Customer> getAll() {
        return customerRepository.getAllCustomers();
    }

}

