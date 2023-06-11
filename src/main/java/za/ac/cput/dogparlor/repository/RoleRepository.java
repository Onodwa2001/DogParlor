/* RoleRepositoryjava
   Repository for Role entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;


import za.ac.cput.dogparlor.domain.Role;

import java.util.HashSet;
import java.util.Set;

public class RoleRepository implements IRoleRepository{
    private static RoleRepository repository = null;
    private Set<Role> roleDB  = null;

    private RoleRepository(){
        roleDB = new HashSet<Role>();
    }

    public static RoleRepository getRepository(){

        if (repository == null){
            repository = new RoleRepository();
        }
        return repository;
    }

    @Override
    public Role create(Role role){

        boolean success = roleDB.add(role);

        if (!success) {
            return null;
        }

        return role;
    }

    @Override
    public Role read(Integer id) {
        return roleDB.stream()
                .filter( role -> role.getRoleId() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public Role update(Role role) {
        Role original = read(role.getRoleId());

        if (original == null)
            return  null;

        boolean successDelete = roleDB.remove(original);
        if(!successDelete)
            return  null;

        boolean successAdd = roleDB.add(role);
        if (!successAdd)
            return null;
        return role;
    }

    @Override
    public boolean delete(Integer id) {
        Role oldRole = read(id);

        if (oldRole == null) {
            return false;
        }

        return roleDB.remove(oldRole);
    }

    @Override
    public Set<Role> getAll() {
        return roleDB;
    }
}
