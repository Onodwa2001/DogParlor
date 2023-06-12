/* ServicePackageServiceImpl.java
   Service for ServicePackage entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.ServicePackage;
import za.ac.cput.dogparlor.repository.ServicePackageRepository;
import za.ac.cput.dogparlor.service.ServicePackageService;

import java.util.Set;

public class ServicePackageServiceImpl implements ServicePackageService {

    private static ServicePackageServiceImpl service = null;
    private ServicePackageRepository repo = null;


    private ServicePackageServiceImpl(){
        if(repo == null){
            repo = ServicePackageRepository.getRepository();
        }
    }

    public static ServicePackageServiceImpl getService(){
        if (service == null) {
            service = new ServicePackageServiceImpl();
        }
        return service;
    }

    @Override
    public ServicePackage create(ServicePackage servicePackage)
    {
        return repo.create(servicePackage);
    }

    @Override
    public ServicePackage read(Integer integer) {
        return repo.read(integer);
    }

    @Override
    public ServicePackage update(ServicePackage servicePackage) {
        return repo.update(servicePackage);
    }


    @Override
    public boolean delete(Integer integer){
        return repo.delete(integer);
    }

    @Override
    public Set<ServicePackage> getAll() {
        return repo.getAll();
    }

}
