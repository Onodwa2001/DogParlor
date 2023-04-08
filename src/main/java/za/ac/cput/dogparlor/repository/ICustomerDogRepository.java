/*ICustomerDogRepository.java
Interface repository for CustomerDog
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;

        import za.ac.cput.dogparlor.domain.CustomerDog;

        import java.util.Set;

public interface ICustomerDogRepository extends IRepository<CustomerDog, Integer> {

    Set<CustomerDog> getAllCustomerDogs();

}