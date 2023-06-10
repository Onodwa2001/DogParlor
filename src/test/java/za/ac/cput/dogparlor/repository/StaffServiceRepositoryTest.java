/* StaffServiceRepositoryTest.java
  Repository testcase for StaffService entity
  Author: Byron Young (218155077)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.StaffService;
import za.ac.cput.dogparlor.factory.StaffServiceFactory;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class StaffServiceRepositoryTest {
    private static final StaffServiceRepository repository = StaffServiceRepository.getStaffServiceRepository();
    private static final StaffService staffService = StaffServiceFactory.createStaffService(101, 255);

    @Test
    void a_create() {
        StaffService createdStaffService = repository.create(staffService);
        System.out.println(createdStaffService);
        assertEquals(staffService.getStaffID(), createdStaffService.getStaffID());
    }

    @Test
    void b_read() {
        StaffService retrievedStaffService = repository.read(staffService.getStaffID());
        System.out.println(retrievedStaffService);
        assertNotNull(retrievedStaffService);
    }

    @Test
    void c_update() {
        StaffService updated = new StaffService.Builder().copy(staffService)
                .setStaffID(101)
                .setServiceID(300)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(staffService.getStaffID());
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllStaffService() {
        Set<StaffService> set = repository.getAllStaffService();
        System.out.println(set);
        assertNotNull(set);
    }
}