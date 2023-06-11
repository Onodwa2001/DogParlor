
package za.ac.cput.dogparlor.service.impl;

        import org.junit.jupiter.api.MethodOrderer;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.TestMethodOrder;
        import za.ac.cput.dogparlor.domain.Dog;
        import za.ac.cput.dogparlor.factory.DogFactory;

        import java.util.Set;

        import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DogServiceImplTest {

    private DogServiceImpl dogService = null;
    private Dog dog = DogFactory.createDog(2432,"Waffles",2,"Welsh Corgi","small","short");

    @Test
    void a_create() {
        Dog dog1 = dogService.create(dog);
        assertNotNull(dog1);
        System.out.println("Created: " + dog1);
    }

    @Test
    void b_read() {
        Dog dog1 = dogService.read(dog.getDogID());
        assertNotNull(dog1);
        System.out.println("Read: " + dog1);
    }

    @Test
    void c_update() {
        Dog dog1 = new Dog.Builder().copy(dog)
                .setDogID(4566)
                .build();
        Dog updated = dogService.update(dog1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = dogService.delete(dog.getDogID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Dog> dogs = dogService.getAll();
        assertNotNull(dogs);
        System.out.println("All items: " + dogs);
    }
}