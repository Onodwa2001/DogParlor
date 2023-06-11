package za.ac.cput.dogparlor.service.impl;


import za.ac.cput.dogparlor.domain.Service;
import za.ac.cput.dogparlor.repository.ServiceRepository;
import za.ac.cput.dogparlor.service.ServiceService;

import java.util.Set;

public class ServiceServiceImpl implements ServiceService {

    private static ServiceServiceImpl serviceService = null;
    private ServiceRepository serviceRepository = null;

    private ServiceServiceImpl() {
        serviceRepository = ServiceRepository.getServiceRepository();
    }

    public static ServiceServiceImpl getInstance() {
        if (serviceService == null)
            serviceService = new ServiceServiceImpl();
        return serviceService;
    }

    @Override
    public Service create(Service service) {
        return serviceRepository.create(service);
    }

    @Override
    public Service read(Integer integer) {
        return serviceRepository.read(integer);
    }

    @Override
    public Service update(Service service) {
        return serviceRepository.update(service);
    }

    @Override
    public boolean delete(Integer integer) {
        return serviceRepository.delete(integer);
    }

    @Override
    public Set<Service> getAll() {
        return serviceRepository.getAllServices();
    }
}
