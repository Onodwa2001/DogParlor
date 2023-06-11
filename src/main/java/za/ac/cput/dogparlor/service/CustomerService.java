
package za.ac.cput.dogparlor.service;

        import za.ac.cput.dogparlor.domain.Customer;

        import java.util.Set;

public interface CustomerService extends IService<Customer, Integer> {

    Set<Customer> getAll();

}