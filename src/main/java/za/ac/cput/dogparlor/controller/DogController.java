package za.ac.cput.dogparlor.controller;


        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import za.ac.cput.dogparlor.domain.Dog;
        import za.ac.cput.dogparlor.factory.DogFactory;
        import za.ac.cput.dogparlor.service.DogService;

        import java.util.Set;
@RestController
@RequestMapping("/dog")
public class DogController {
 @Autowired
    private DogService service;

    @PostMapping("/create")
    public Dog create(@RequestBody Dog dog) {
        Dog created = DogFactory.createDog(dog.getDogID(),
                dog.getName(),
                dog.getAge(),
                dog.getBreed(),
                dog.getDogSize(),
                dog.getHairLength());

        return service.create(created);
    }

    @GetMapping("/read/{id}")
    public Dog read(@PathVariable int id) {
        return service.read(id);
    }

    @PostMapping("/update")
    public Dog update(@RequestBody Dog dog) {
        return service.update(dog);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Dog> getAll() {
        return service.getAll();
    }
}