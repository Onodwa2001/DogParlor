/* IExtraServiceRepository.java
   Interface Repository for Extra Service entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.ExtraService;

import java.util.Set;

public interface IExtraServiceRepository extends IRepository<ExtraService,Integer> {
    Set<ExtraService> getAll();
}
