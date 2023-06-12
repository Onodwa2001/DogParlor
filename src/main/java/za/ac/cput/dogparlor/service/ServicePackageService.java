/* ServicePackageService.java
   Interface Service for ServicePackage entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.ServicePackage;

import java.util.Set;

public interface ServicePackageService extends IService<ServicePackage, Integer>{
     Set<ServicePackage> getAll();

}
