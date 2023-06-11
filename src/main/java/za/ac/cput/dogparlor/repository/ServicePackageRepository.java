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
        ServicePackage original = read(servicePackage.getExtraId());

        if (original == null)
            return  null;

        boolean successDelete = servicePackagesDB.remove(original);
        if(!successDelete)
            return  null;

        boolean successAdd = servicePackagesDB.add(servicePackage);
        if (!successAdd)
            return null;
        return servicePackage;
    }

    @Override
    public boolean delete(Integer id){
        ServicePackage oldPackage = read(id);

        if (oldPackage == null) {
            return false;
        }
        return servicePackagesDB.remove(oldPackage);
    }

    @Override
    public Set<ServicePackage> getAll() {
        return servicePackagesDB;
    }

}
