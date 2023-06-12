/* ExtraServiceServiceImplTest.java
   Service test case for ExtraService entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service.impl;


import za.ac.cput.dogparlor.domain.ExtraService;
import za.ac.cput.dogparlor.factory.ExtraServiceFactory;
import za.ac.cput.dogparlor.service.ExtraServiceService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
 class ExtraServiceServiceImplTest {
    private static ExtraService extraService = ExtraServiceFactory.createService(2,"Dip");
    private static ExtraServiceService service = ExtraServiceServiceImpl.getService();

    @Test
    public void a_create(){
        ExtraService created = service.create(extraService);
        assertNotNull(created);
        System.out.println("Created: " +  created);
    }

    @Test
    public void b_read(){
        ExtraService read = service.read(extraService.getExtraId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        ExtraService extraService1 = new ExtraService
                                    .Builder()
                                    .copy(extraService)
                                    .setExtraServiceName("Deworming")
                                    .build();
        ExtraService updated = service.update(extraService1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }
    @Test
    public void e_delete(){
        boolean deleted = service.delete(extraService.getExtraId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    public void d_getAll(){
        Set<ExtraService> extraServices = service.getAll();
        assertNotNull(extraServices);
        System.out.println("Show All: " + extraServices);
    }
}
