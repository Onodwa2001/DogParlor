/* IRoleRepository.java
   Interface Repository for Role entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;


import za.ac.cput.dogparlor.domain.Role;

import java.util.Set;

public interface IRoleRepository extends IRepository<Role,Integer>{
    Set<Role> getAll();

}
