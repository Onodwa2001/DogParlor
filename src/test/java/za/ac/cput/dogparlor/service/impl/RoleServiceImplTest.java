/* RoleServiceImplTest.java
   Service test case for Role entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Role;
import za.ac.cput.dogparlor.factory.RoleFactory;
import za.ac.cput.dogparlor.service.RoleService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Set;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RoleServiceImplTest {
    private RoleService service = RoleServiceImpl.getService();
    private Role role = new RoleFactory().createRole(1, "Manager", "Groomer");

    @Test
    public void a_create(){
        Role created = service.create(role);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read(){
        Role read = service.read(role.getRoleId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update(){
        Role role1 = new Role.Builder()
                            .copy(role)
                            .setRoleName("Employee")
                            .setDescription("Clipper Assistant")
                            .build();
        Role updated = service.update(role1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }
    @Test
    public void e_delete(){
        boolean deleted = service.delete(role.getRoleId());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    public void d_getAll(){
        Set<Role> roles = service.getAll();
        assertNotNull(roles);
        System.out.println("All items: " + roles);
    }
}
