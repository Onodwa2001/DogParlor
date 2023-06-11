/*CustomerDogRepositoryTest.java
  test  for the CustomerDog Repository
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

        import org.junit.jupiter.api.MethodOrderer;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.TestMethodOrder;
        import za.ac.cput.dogparlor.domain.CustomerDog;
        import za.ac.cput.dogparlor.factory.CustomerDogFactory;

        import java.util.HashSet;
        import java.util.Set;

        import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerDogRepositoryTest {

    private static final CustomerDogRepository repository = CustomerDogRepository.getCustomerDogRepository();
    private static final CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963,  36987);

    @Test
    void a_create() {
        CustomerDog createdCustomerDog = repository.create(customerDog);
        System.out.println(createdCustomerDog);
        assertEquals(customerDog.getCustomerID(), createdCustomerDog.getCustomerID());
    }

    @Test
    void b_read() {
        CustomerDog retrievedCustomerDog = repository.read(customerDog.getCustomerID());
        System.out.println(retrievedCustomerDog);
        assertNotNull(retrievedCustomerDog);
    }

    @Test
    void c_update() {
        CustomerDog updated = new CustomerDog.Builder().copy(customerDog)
                .setCustomerID(78963)
                .setDogID(36987)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(customerDog.getCustomerID());
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllDogs() {
        Set<CustomerDog> set = repository.getAllCustomerDogs();
        System.out.println(set);
        assertNotNull(set);
    }
}