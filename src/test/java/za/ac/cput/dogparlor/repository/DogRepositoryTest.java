/*DogRepositoryTest.java
  test  for the Dog Repository
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;

        import org.junit.jupiter.api.MethodOrderer;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.TestMethodOrder;
        import za.ac.cput.dogparlor.domain.Dog;
        import za.ac.cput.dogparlor.factory.DogFactory;

        import java.util.HashSet;
        import java.util.Set;

        import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DogRepositoryTest {

    private static final DogRepository repository = DogRepository.getDogRepository();
    private static final Dog dog = DogFactory.createDog(21823, "Ankira", 2, "pitbull", "small", "'short");

    @Test
    void a_create() {
        Dog createdDog = repository.create(dog);
        System.out.println(createdDog);
        assertEquals(dog.getDogID(), createdDog.getDogID());
    }

    @Test
    void b_read() {
        Dog retrievedDog = repository.read(dog.getDogID());
        System.out.println(retrievedDog);
        assertNotNull(retrievedDog);
    }

    @Test
    void c_update() {
        Dog updated = new Dog.Builder().copy(dog)
                .setDogID(89634)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(dog.getDogID());
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllDogs() {
        Set<Dog> set = repository.getAllDogs();
        System.out.println(set);
        assertNotNull(set);
    }
}