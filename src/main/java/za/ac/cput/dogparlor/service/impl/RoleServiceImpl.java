/* RoleServiceImpl.java
   Service for Role entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Role;
import za.ac.cput.dogparlor.repository.RoleRepository;
import za.ac.cput.dogparlor.service.RoleService;

import java.util.Set;

public class RoleServiceImpl implements RoleService {

    private final RoleRepository repo;
    private static RoleService service;

    public RoleServiceImpl(){
        this.repo = RoleRepository.getRepository();
    }

    public static RoleServiceImpl getService(){
        if(service == null)
            service = new RoleServiceImpl();
        return (RoleServiceImpl) service;
    }


    @Override
    public Role create(Role role) {
        return  repo.create(role);
    }

    @Override
    public Role read(Integer id) {
        return repo.read(id);
    }

    @Override
    public Role update(Role role) {
        return repo.update(role);
    }


    @Override
    public boolean delete(Integer id) {
        boolean success = repo.delete(id);
        return success;
    }

    @Override
    public Set<Role> getAll() {
        return repo.getAll();
    }
}

