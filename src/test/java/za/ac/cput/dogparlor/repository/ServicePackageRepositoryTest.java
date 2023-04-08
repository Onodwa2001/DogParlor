/* ServicePackageRepositoryTest.java
  Repository testcase for ServicePackage entity
  Author: Lindiwe Thokozile Somana (218076509)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.ServicePackage;
import za.ac.cput.dogparlor.factory.ServicePackageFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ServicePackageRepositoryTest {

    private static ServicePackageRepository repository = ServicePackageRepository.getRepository();
    private static ServicePackage serPack = ServicePackageFactory.createPackage(1,10);
    @Test
    void a_create() {
        ServicePackage create = repository.create(serPack);
        assertEquals(serPack.getServiceId(), create.getServiceId());
        System.out.println("Create: " + create);
    }

    @Test
    void b_read() {
        ServicePackage read = repository.read(serPack.getServiceId());
        assertNotNull(read);
        System.out.println("Read:  " + read);
    }

    @Test
    void c_update() {
        ServicePackage updated = new ServicePackage.Builder().copy(serPack).setExtraId(20).build();
        System.out.println("Updated:  " + updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        ServicePackage deleted = repository.delete(serPack);
        assertNotNull(deleted);
        System.out.println("Delete:  " + deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}