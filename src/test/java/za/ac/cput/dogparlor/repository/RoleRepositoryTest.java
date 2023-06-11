/* RoleRepositoryTest.java
   Repository testcase for Role entity
  Author: Lindiwe Thokozile Somana (218076509)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Role;
import za.ac.cput.dogparlor.factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RoleRepositoryTest {

    private static RoleRepository repository = RoleRepository.getRepository();
    private static Role role = RoleFactory.createRole(4,"Employee", "Groomer");
    @Test
    void a_create() {
        Role create = repository.create(role);
        assertEquals(role.getRoleId(), create.getRoleId());
        System.out.println("Create: " + create);
    }

    @Test
    void b_read() {
        Role read = repository.read(role.getRoleId());
        assertNotNull(read);
        System.out.println("Read:  " + read);
    }

    @Test
    void c_update() {
        Role updated = new Role.Builder().copy(role)
                      .setRoleName("Manager").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:  " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(role.getRoleId());
        assertNotNull(deleted);
        System.out.println("Delete:  " + deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }

}