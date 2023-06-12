/*ServiceRepository.java
  Repository class for the Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.domain.Service;

import java.util.HashSet;
import java.util.Set;

public class ServiceRepository implements IServiceRepository{

    static ServiceRepository serviceRepository = null;

    Set<Service> DB = null;

    private ServiceRepository() { DB = new HashSet<>();}

    public static ServiceRepository getServiceRepository(){
        if (serviceRepository == null) {
            serviceRepository = new ServiceRepository();
        }
        return serviceRepository;
    }


    @Override
    public Service create(Service service) {
        boolean success = DB.add(service);

        if(!success) {
            return null;
        }
        return service;
    }

    @Override
    public Service read(Integer integer) {
        return DB.stream()
                .filter( service -> service.getServiceId() == integer)
                .findAny()
                .orElse(null);
    }

    @Override
    public Service update(Service service) {
        Service oldService = read(service.getServiceId());

        if (oldService == null)
            return null;

        boolean successfulDelete = DB.remove(oldService);
        if (!successfulDelete)
            return null;

        boolean successfulAdd = DB.add(service);
        if (!successfulAdd)
            return null;

        return service;
        }

    @Override
    public boolean delete(Integer integer) {
    Service foundService = read(integer);

    if (foundService == null)
        return false;

    return DB.remove(foundService);
    }



    @Override
    public Set<Service> getAllServices() {
        return DB;
    }


}
