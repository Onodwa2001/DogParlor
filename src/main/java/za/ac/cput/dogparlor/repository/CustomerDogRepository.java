/*CustomerDogRepository.java
  repository for the CustomerDog
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;
        import za.ac.cput.dogparlor.domain.CustomerDog;

        import java.util.HashSet;
        import java.util.Set;

public class CustomerDogRepository implements ICustomerDogRepository {

    static CustomerDogRepository customerDogRepository = null;
    Set<CustomerDog> DB = null;

    private CustomerDogRepository() {
        DB = new HashSet<>();
    }

    public static CustomerDogRepository getCustomerDogRepository() {
        if (customerDogRepository == null) {
            customerDogRepository = new CustomerDogRepository();
        }
        return customerDogRepository;
    }

    @Override
    public CustomerDog create(CustomerDog customerDog) {
        boolean success = DB.add(customerDog);

        if (!success) {
            return null;
        }

        return customerDog;
    }

    @Override
    public CustomerDog read(Integer id) {
        return DB.stream()
                .filter( customerDog -> customerDog.getCustomerID()== id )
                .findAny()
                .orElse(null);
    }

    @Override
    public CustomerDog update(CustomerDog customerDog) {
        CustomerDog oldCustomerDog = read(customerDog.getCustomerID());

        if (oldCustomerDog != null) {
            DB.remove(oldCustomerDog);
            DB.add(customerDog);
            return customerDog;
        }

        return null;
    }

    @Override
    public CustomerDog delete(CustomerDog customerDog) {
        CustomerDog oldCustomerDog = read(customerDog.getCustomerID());

        if (oldCustomerDog != null) {
            DB.remove(oldCustomerDog);
            return oldCustomerDog;
        }

        return null;
    }

    @Override
    public Set<CustomerDog> getAllCustomerDogs() {
        return DB;
    }

}