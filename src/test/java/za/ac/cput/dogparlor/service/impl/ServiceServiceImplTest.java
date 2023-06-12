package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Service;
import za.ac.cput.dogparlor.factory.ServiceFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ServiceServiceImplTest {

    private ServiceServiceImpl serviceService = null;
    private Service service = ServiceFactory.createService(1111, 53.99,"Grooming", "1 hour", "Normal dog grooming","Normal" );

    @Test
    void a_create() {
        Service service1 = serviceService.create(service);
        assertNotNull(service1);
        System.out.println("Created: " + service1);
    }

    @Test
    void b_read() {
        Service service1 = serviceService.read(service.getServiceId());
        assertNotNull(service1);
        System.out.println("Read: " + service1);
    }

    @Test
    void c_update() {
        Service service1 = new Service.Builder().copy(service)
                .setServiceId(1111)
                .build();
        Service updated = serviceService.update(service1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = serviceService.delete(service.getServiceId());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Service> services = serviceService.getAll();
        assertNotNull(services);
        System.out.println("All items: " + services);
    }
}
