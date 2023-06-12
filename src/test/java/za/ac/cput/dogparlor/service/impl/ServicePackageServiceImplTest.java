/* ServicePackageServiceImplTest.java
   Service test case for ServicePackage entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.ServicePackage;
import za.ac.cput.dogparlor.factory.ServicePackageFactory;
import za.ac.cput.dogparlor.service.ServicePackageService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@TestMethodOrder(MethodOrderer.MethodName.class)
class ServicePackageServiceImplTest {
    private static ServicePackage servicePackage = ServicePackageFactory.createPackage(1, 10);
    private static ServicePackageService service = ServicePackageServiceImpl.getService();
    @Test
    public void a_create() {
        ServicePackage created = service.create(servicePackage);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        ServicePackage servicePackage1 = service.read(servicePackage.getServiceId());
        assertNotNull(servicePackage1);
        System.out.println("Read: " + servicePackage1);
    }

    @Test
    public void c_update() {
        ServicePackage servicePackage1 = new ServicePackage.Builder().copy(servicePackage)
                .setServiceId(3)
                .build();
        ServicePackage updated = service.update(servicePackage1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        boolean deleted = service.delete(servicePackage.getExtraId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    public void d_getAll() {
        Set<ServicePackage> servicePackages = service.getAll();
        assertNotNull(servicePackages);
        System.out.println("Show All: " + servicePackages);
/*





    }*/
    }
}
