/* IServicePackageRepository.java
  Interface Repository for Service Package entity
  Author: Lindiwe Thokozile Somana (218076509)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;


import za.ac.cput.dogparlor.domain.ServicePackage;

import java.util.Set;

public interface IServicePackageRepository extends IRepository<ServicePackage,Integer>{

    Set<ServicePackage> getAll();
}
