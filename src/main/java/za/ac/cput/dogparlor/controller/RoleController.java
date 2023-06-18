/* RoleController.java
   Controller class for Role entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date: 17 June 2023
 */
package za.ac.cput.dogparlor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dogparlor.domain.Role;
import za.ac.cput.dogparlor.factory.RoleFactory;
import za.ac.cput.dogparlor.service.RoleService;

import java.util.Set;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService service;

    @PostMapping("/create")
    public Role create(@RequestBody Role role){
        Role newRole = RoleFactory.createRole( role.getRoleId(),
                                               role.getRoleName(),
                                        role.getDescription());
        return service.create(role);
    }


    @GetMapping("/read/{id}")
    public Role read(@PathVariable int id) {
        return service.read(id);
    }

    @PostMapping("/update")
    public Role update(@RequestBody Role role) {
        return service.update(role);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Role> getAll() {
        return service.getAll();
    }

}
