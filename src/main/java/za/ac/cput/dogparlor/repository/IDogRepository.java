/*IDogRepository.java
Interface repository for Dog
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */
package za.ac.cput.dogparlor.repository;
import za.ac.cput.dogparlor.domain.Dog;
import java.util.Set;
public interface IDogRepository extends IRepository<Dog, Integer> {
    Set<Dog> getAllDogs();
}
