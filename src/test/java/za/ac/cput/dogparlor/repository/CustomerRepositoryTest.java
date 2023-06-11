/*CustomerRepositoryTest.java
  test  for the Customer Repository
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

        import org.junit.jupiter.api.MethodOrderer;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.TestMethodOrder;
        import za.ac.cput.dogparlor.domain.Customer;
        import za.ac.cput.dogparlor.factory.CustomerFactory;

        import java.util.HashSet;
        import java.util.Set;

        import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerRepositoryTest {

    private static final CustomerRepository repository = CustomerRepository.getCustomerRepository();
    private static final Customer customer = CustomerFactory.createCustomer(21387);

    @Test
    void a_create() {
        Customer createdCustomer = repository.create(customer);
        System.out.println(createdCustomer);
        assertEquals(customer.getCustomerID(), createdCustomer.getCustomerID());
    }

    @Test
    void b_read() {
        Customer retrievedCustomer = repository.read(customer.getCustomerID());
        System.out.println(retrievedCustomer);
        assertNotNull(retrievedCustomer);
    }

    @Test
    void c_update() {
        Customer updated = new Customer.Builder().copy(customer)
                .setCustomerID(21397)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(customer.getCustomerID());
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllDogs() {
        Set<Customer> set = repository.getAllCustomers();
        System.out.println(set);
        assertNotNull(set);
    }
}