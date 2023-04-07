/* ServicePackageRepository.java
   Repository for ServicePackage entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.ServicePackage;
import java.util.HashSet;
import java.util.Set;

public class ServicePackageRepository implements IServicePackageRepository{
    private static ServicePackageRepository repository = null;
    private Set<ServicePackage> servicePackagesDB  = null;

    private ServicePackageRepository(){
        servicePackagesDB = new HashSet<ServicePackage>();
    }

    public static ServicePackageRepository getRepository(){

        if (repository == null){
            repository = new ServicePackageRepository();
        }
        return repository;
    }

    @Override
    public ServicePackage create(ServicePackage servicePackage){

        boolean success = servicePackagesDB.add(servicePackage);

        if (!success) {
            return null;
        }

        return servicePackage;
    }

    @Override
    public ServicePackage read(Integer id) {
        return servicePackagesDB.stream()
                .filter( servicePackage -> servicePackage.getServiceId() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public ServicePackage update(ServicePackage servicePackage) {
        ServicePackage oldPackage = read(servicePackage.getExtraId());

        if (oldPackage != null) {
            servicePackagesDB.remove(oldPackage);
            servicePackagesDB.add(servicePackage);
            return servicePackage;
        }
        return null;
    }

    @Override
    public ServicePackage delete(ServicePackage servicePackage) {
        ServicePackage oldPackage = read(servicePackage.getServiceId());

        if (oldPackage != null) {
            servicePackagesDB.remove(oldPackage);
            return oldPackage;
        }
        return null;
    }

    @Override
    public Set<ServicePackage> getAll() {
        return servicePackagesDB;
    }

}
