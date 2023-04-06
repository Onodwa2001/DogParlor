
package za.ac.cput.dogparlor.factory;
        import org.junit.jupiter.api.Test;
        import za.ac.cput.dogparlor.domain.Customer;
        import static org.junit.jupiter.api.Assertions.*;
class CustomerFactoryTest {

    @Test
    public void test() {
        Customer customer= CustomerFactory.createCustomer(21387);
        System.out.println(customer.toString());
        assertNotNull(customer);
    }

    @Test
    public void test_fail() {
        Customer customer = CustomerFactory.createCustomer( 21387);
        System.out.println(customer);
        assertNotNull(customer);
    }

}