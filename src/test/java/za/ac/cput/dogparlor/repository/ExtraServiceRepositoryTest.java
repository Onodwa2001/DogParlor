/* ExtraServiceRepositoryTest.java
   Repository testcase for ExtraService entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.ExtraService;
import za.ac.cput.dogparlor.factory.ExtraServiceFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ExtraServiceRepositoryTest {

    private static ExtraServiceRepository repository = ExtraServiceRepository.getRepository();
    private static ExtraService service = ExtraServiceFactory.createService(53,"Anal Secretion");
    @Test
    void a_create() {
        ExtraService create = repository.create(service);
        assertEquals(service.getExtraId(), create.getExtraId());
        System.out.println("Create: " + create);
    }

    @Test
    void b_read() {
        ExtraService read = repository.read(service.getExtraId());
        assertNotNull(read);
        System.out.println("Read:  " + read);
    }

    @Test
    void c_update() {
        ExtraService updated = new ExtraService.Builder().copy(service)
                              .setExtraServiceName("Winter Shave").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:  " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(service.getExtraId());
        assertNotNull(deleted);
        System.out.println("Delete:  " + deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}