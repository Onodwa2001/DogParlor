/*DogFactoryTest.java
  test  for the Dog factory
  Author:Wendy Samsodien (218233779)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DogFactoryTest {

    @Test
    public void test() {
        Dog dog = DogFactory.createDog(21823, "Ankira", 2, "pitbull", "small", "'short");
        System.out.println(dog);
        assertNotNull(dog);
    }

    @Test
    public void test_fail() {
        Dog dog = DogFactory.createDog(218233, "", 2, "pitbull", "small", "short");
        System.out.println(dog);
        assertNotNull(dog);
    }

    @Test
    public void objectEquality() {
        Dog dog = DogFactory.createDog(21823, "Ankira", 2, "pitbull", "small", "'short");
        Dog dog2 = DogFactory.createDog(21823, "Ankira", 2, "pitbull", "small", "'short");
        assertEquals(dog, dog2);
    }

    @Test
    public void objectIdentity() {
        Dog dog = DogFactory.createDog(21823, "Ankira", 2, "pitbull", "small", "'short");
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Dog dog2 = dog;
        assertSame(dog, dog2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Dog dog = DogFactory.createDog(21823, "Ankira", 2, "pitbull", "small", "'short");
        try {
            Thread.sleep(600);
            assertEquals(21823, dog.getDogID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Dog dog = DogFactory.createDog(21823, "Ankira", 2, "pitbull", "small", "'short");
        assertNotNull(dog);
    }
}