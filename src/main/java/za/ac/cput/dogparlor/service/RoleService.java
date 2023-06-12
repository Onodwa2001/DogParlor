/* RoleService.java
   Service for Role entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Role;

import java.util.Set;

public interface RoleService extends IService<Role, Integer>{
    Set<Role> getAll();

}
