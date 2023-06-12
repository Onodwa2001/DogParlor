package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Service;


import java.util.Set;

public interface ServiceService extends IService<Service, Integer> {

    Set<Service> getAll();

}
