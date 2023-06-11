/*DogRepository.java
  repository for the Dog
  Author:Wendy Samsodien (218233779)
  Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;
import za.ac.cput.dogparlor.domain.Dog;

import java.util.HashSet;
import java.util.Set;
public class DogRepository implements IDogRepository {
    static DogRepository dogRepository = null;
    Set<Dog> DB = null;

    private DogRepository() {DB = new HashSet<>();
    }

    public static DogRepository getDogRepository() {
        if (dogRepository == null) {
            dogRepository = new DogRepository();
        }
        return dogRepository;
    }

    @Override
    public Dog create(Dog dog) {
        boolean success = DB.add(dog);

        if (!success) {
            return null;
        }

        return dog;
    }

    @Override
    public Dog read(Integer id) {
        return DB.stream()
                .filter( dog -> dog.getDogID() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public Dog update(Dog dog) {
        Dog oldDog = read(dog.getDogID());
        if (oldDog == null)
            return null;
        boolean successfulDelete = DB.remove(oldDog);
        if (!successfulDelete)
            return null;
        boolean successfulAdd = DB.add(dog);
        if (!successfulAdd)
            return null;
        return dog;
    }
    @Override
    public boolean delete(Integer id) {
        Dog oldDog = read(id);
        if (oldDog ==null)
            return false;
        return DB.remove(oldDog);
    }

    @Override
    public Set<Dog> getAllDogs() { return DB;}
}
