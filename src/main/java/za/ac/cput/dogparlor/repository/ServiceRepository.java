/*ServiceRepository.java
  Repository class for the Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.repository;

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

        if(oldService != null) {
            DB.remove(oldService);
            DB.add(service);
            return service;
        }
        return null;
    }

    @Override
    public Service delete(Service service) {
        Service oldService = read(service.getServiceId());

        if(oldService != null) {
            DB.remove(oldService);
            return oldService;
        }
        return null;
    }

    @Override
    public Set<Service> getAllServices() {
        return DB;
    }


}
