
package za.ac.cput.dogparlor.factory;
        import org.junit.jupiter.api.Test;
        import za.ac.cput.dogparlor.domain.Dog;
        import static org.junit.jupiter.api.Assertions.*;
class DogFactoryTest {

    @Test
    public void test() {
        Dog dog = DogFactory.createDog(21823 , "Ankira", 2 ,"pitbull" ,"small","'short" );
        System.out.println(dog.toString());
        assertNotNull(dog);
    }

    @Test
    public void test_fail() {
        Dog dog = DogFactory.createDog( 218233, "", 2 , "pitbull","small", "short");
        System.out.println(dog.toString());
        assertNotNull(dog);
    }

}