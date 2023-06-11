package za.ac.cput.dogparlor.service;

        import za.ac.cput.dogparlor.domain.CustomerDog;

        import java.util.Set;

public interface CustomerDogService extends IService<CustomerDog, Integer> {

    Set<CustomerDog> getAll();

}