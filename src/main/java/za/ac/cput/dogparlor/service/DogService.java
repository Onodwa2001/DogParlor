
package za.ac.cput.dogparlor.service;

        import za.ac.cput.dogparlor.domain.Dog;

        import java.util.Set;

public interface DogService extends IService<Dog, Integer> {

    Set<Dog> getAll();

}