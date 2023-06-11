
/*DogFactory.java
  Factory for the Dog
  Author:Wendy Samsodien (218233779)
  Date:03 April 2023
 */
package za.ac.cput.dogparlor.factory;
        import za.ac.cput.dogparlor.util.Helper;
        import za.ac.cput.dogparlor.domain.Dog;

public class DogFactory {
    public static Dog createDog(int dogID ,String name, int age , String breed, String dogSize, String hairLength){
        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(breed) || Helper.isNullOrEmpty(dogSize) || Helper.isNullOrEmpty(hairLength))
            return null;
        return new Dog.Builder()
                .setDogID(dogID)
                .setName(name)
                .setAge(age)
                .setBreed(breed)
                .setDogSize(dogSize)
                .setHairLength(hairLength)
                .build();
    }
}

