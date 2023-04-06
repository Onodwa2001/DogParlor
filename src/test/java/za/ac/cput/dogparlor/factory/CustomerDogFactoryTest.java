package za.ac.cput.dogparlor.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.CustomerDog;
import static org.junit.jupiter.api.Assertions.*;
public class CustomerDogFactoryTest {
    @Test
    public void test() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963, 36987);
        System.out.println(customerDog.toString());
        assertNotNull(customerDog);
    }

    @Test
    public void test_fail() {
        CustomerDog customerDog = CustomerDogFactory.createCustomerDog(78963 , 36987);
        System.out.println(customerDog.toString());
        assertNotNull(customerDog);
    }

    @Test
    void testObjectIdentity() {
        CustomerDog customerDog = new CustomerDog.Builder()
                .setCustomerID(78963)
                .setDogID(36987)
                .build();

        CustomerDog customerDog2 = customerDog;

        assertSame(customerDog2, customerDog);
    }


}
