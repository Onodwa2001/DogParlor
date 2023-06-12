package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.CustomerService;


import java.util.Set;

public interface CustomerServiceService extends IService<CustomerService, Integer> {

    Set<CustomerService> getAll();

}
