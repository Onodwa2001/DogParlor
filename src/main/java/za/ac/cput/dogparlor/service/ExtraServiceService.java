/* ExtraServiceService.java
   Interface Service for ExtraService entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service;


import za.ac.cput.dogparlor.domain.ExtraService;

import java.util.Set;

public interface ExtraServiceService extends IService<ExtraService, Integer>{
    Set<ExtraService> getAll();

}
