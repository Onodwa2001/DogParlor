/*ICustomerRepository.
Interface repository for Customer
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

        import za.ac.cput.dogparlor.domain.Customer;

        import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, Integer> {

    Set<Customer> getAllCustomers();

}