package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Dog;
import za.ac.cput.dogparlor.repository.DogRepository;
import za.ac.cput.dogparlor.service.DogService;

import java.util.Set;

public class DogServiceImpl implements DogService {

    private static DogServiceImpl dogService = null;
    private DogRepository dogRepository = null;

    private DogServiceImpl() {
        dogRepository = DogRepository.getDogRepository();
    }

    public static DogServiceImpl getInstance() {
        if (dogService == null)
            dogService = new DogServiceImpl();
        return dogService;
    }

    @Override
    public Dog create(Dog dog) {
        return dogRepository.create(dog);
    }

    @Override
    public Dog read(Integer integer) {
        return dogRepository.read(integer);
    }

    @Override
    public Dog update(Dog dog) {
        return dogRepository.update(dog);
    }

    @Override
    public boolean delete(Integer integer) {
        return dogRepository.delete(integer);
    }

    @Override
    public Set<Dog> getAll() {
        return dogRepository.getAllDogs();
    }

}

