package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.CustomerDog;
import za.ac.cput.dogparlor.repository.CustomerDogRepository;
import za.ac.cput.dogparlor.service.CustomerDogService;

import java.util.Set;

public class CustomerDogServiceImpl implements CustomerDogService {

    private static CustomerDogServiceImpl customerDogService = null;
    private CustomerDogRepository customerDogRepository = null;

    public CustomerDogServiceImpl() {
        customerDogRepository = CustomerDogRepository.getCustomerDogRepository();
    }

    public static CustomerDogServiceImpl getInstance() {
        if (customerDogService == null)
            customerDogService = new CustomerDogServiceImpl();
        return customerDogService;
    }

    @Override
    public CustomerDog create(CustomerDog customerDog) {
        return customerDogRepository.create(customerDog);
    }

    @Override
    public CustomerDog read(Integer integer) {
        return customerDogRepository.read(integer);
    }

    @Override
    public CustomerDog update(CustomerDog customerDog) {
        return customerDogRepository.update(customerDog);
    }

    @Override
    public boolean delete(Integer integer) {
        return customerDogRepository.delete(integer);
    }

    @Override
    public Set<CustomerDog> getAll() {
        return customerDogRepository.getAllCustomerDogs();
    }

}
