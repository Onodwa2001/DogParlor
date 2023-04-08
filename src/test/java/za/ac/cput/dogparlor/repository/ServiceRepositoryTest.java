/*ServiceRepositoryTest.java
  Repository test for the Service
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Service;
import za.ac.cput.dogparlor.factory.ServiceFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ServiceRepositoryTest {
    private static final ServiceRepository repository = ServiceRepository.getServiceRepository();
    private static final Service service = ServiceFactory.createService(001, 234.45, "Grooming", "2 Hours", "Trimming dog fur", "Gold");

    @Test
    void a_create() {
        Service createdService = repository.create(service);
        System.out.println(createdService);
        assertEquals(service.getServiceId(), createdService.getServiceId());
    }

    @Test
    void b_read() {
        Service retrievedService = repository.read(service.getServiceId());
        System.out.println(retrievedService);
        assertNotNull(retrievedService);
    }

    @Test
    void c_update() {
        Service updated = new Service.Builder()
                .setServiceId(001)
                .setPrice(234.45)
                .setServiceType("Grooming")
                .setServiceDuration("2 Hours")
                .setServiceDescription("Trimming dog fur")
                .setServicePackage("Gold")
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        Service deleted = repository.delete(service);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllServices() {
        Set<Service> set = repository.getAllServices();
        System.out.println(set);
        assertNotNull(set);
    }
}
