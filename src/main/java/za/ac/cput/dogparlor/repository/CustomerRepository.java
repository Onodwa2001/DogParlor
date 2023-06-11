/*CustomerRepository.java
  repository for the Customer
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;
        import za.ac.cput.dogparlor.domain.Customer;

        import java.util.HashSet;
        import java.util.Set;

public class CustomerRepository implements ICustomerRepository {

    static CustomerRepository customerRepository = null;
    Set<Customer> DB = null;

    private CustomerRepository() {
        DB = new HashSet<>();
    }

    public static CustomerRepository getCustomerRepository() {
        if (customerRepository == null) {
            customerRepository = new CustomerRepository();
        }
        return customerRepository;
    }

    @Override
    public Customer create(Customer customerDog) {
        boolean success = DB.add(customerDog);

        if (!success) {
            return null;
        }

        return customerDog;
    }

    @Override
    public Customer read(Integer id) {
        return DB.stream()
                .filter( customer -> customer.getCustomerID()== id )
                .findAny()
                .orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer = read(customer.getCustomerID());

        if (oldCustomer != null) {
            DB.remove(oldCustomer);
            DB.add(customer);
            return customer;
        }

        return null;
    }

    @Override
    public Customer delete(Customer customer) {
        Customer oldCustomer = read(customer.getCustomerID());

        if (oldCustomer != null) {
            DB.remove(oldCustomer);
            return oldCustomer;
        }

        return null;
    }

    @Override
    public Set<Customer> getAllCustomers() {
        return DB;
    }

}