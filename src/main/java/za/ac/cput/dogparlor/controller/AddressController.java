package za.ac.cput.dogparlor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.factory.AddressFactory;
import za.ac.cput.dogparlor.service.AddressService;

import java.util.Set;
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/create")
    public Address create(@RequestBody Address address) {
        Address created = AddressFactory.createAddress(address.getAddressID(),
                address.getStreetAddress(),
                address.getCity(),
                address.getState(),
                address.getZipCode(),
                address.getCountry());

        return addressService.create(created);
    }

    @GetMapping("/read/{id}")
    public Address read(@PathVariable int id) {
        return addressService.read(id);
    }

    @PostMapping("/update")
    public Address update(@RequestBody Address address) {
        /*addressService.delete(address.getAddressID()); // delete old*/
        return addressService.create(address); // add new one
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return addressService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Address> getAll() {
        return addressService.getAll();
    }
}
