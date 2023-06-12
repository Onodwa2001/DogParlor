/*ServiceRepositoryTest.java
  Repository test for the Service
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.CustomerService;
import za.ac.cput.dogparlor.domain.Service;
import za.ac.cput.dogparlor.factory.ServiceFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

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

        Service updated = new Service.Builder().copy(service)
                .setServiceId(001)
                .setPrice(234.45)
                .setServiceType("Grooming")
                .setServiceDuration("2 Hours")
                .setServiceDescription("Trimming dog fur")
                .setServicePackage("Gold")
                .build();

        Service updatedService = repository.update(updated);
        assertNotNull(updatedService);
        System.out.println("Updated: " + updatedService);


    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(service.getServiceId());
        System.out.println(deleted);
        assertTrue(deleted);
    }

    @Test
    void d_getAllServices() {
        Set<Service> set = repository.getAllServices();
        System.out.println(set);
        assertNotNull(set);
    }
}
