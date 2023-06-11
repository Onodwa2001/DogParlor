/*CustomerDogRepository.java
  repository for the CustomerDog
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;
        import za.ac.cput.dogparlor.domain.Customer;
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
    public CustomerDog update(CustomerDog customerDog) {
        CustomerDog oldCustomerDog = read(customerDog.getCustomerID());
        if (oldCustomerDog == null) {
            return null;
        }
        boolean successfulDelete = DB.remove(oldCustomerDog);
        if (!successfulDelete)
            return null;
        boolean successfulAdd = DB.add(customerDog);
        if (!successfulAdd)
            return null;
        return customerDog;
    }
    @Override
    public boolean delete(Integer id) {
        CustomerDog oldCustomerDog = read(id);
        if (oldCustomerDog ==null)
            return false;
        return DB.remove(oldCustomerDog);
    }


    @Override
    public Set<CustomerDog> getAllCustomerDogs() {
        return DB;
    }

}