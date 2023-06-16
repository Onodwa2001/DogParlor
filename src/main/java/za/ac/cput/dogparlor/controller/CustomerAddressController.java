package za.ac.cput.dogparlor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.factory.CustomerAddressFactory;
import za.ac.cput.dogparlor.service.CustomerAddressService;

import java.util.Set;

@RestController
@RequestMapping("/customer_address")
public class CustomerAddressController {

    @Autowired
    private CustomerAddressService customerAddressService;

    @PostMapping("/create")
    public CustomerAddress create(@RequestBody CustomerAddress customerAddress) {
        CustomerAddress customerAddress1 = CustomerAddressFactory.createCustomerAddress(customerAddress.getCustomerID(),
                customerAddress.getAddressID());
        return customerAddressService.create(customerAddress1);
    }

    @GetMapping("/read/{id}")
    public CustomerAddress read(@PathVariable int id) {
        return customerAddressService.read(id);
    }

    @PostMapping("/update")
    public CustomerAddress update(@RequestBody CustomerAddress customerAddress) {
        return customerAddressService.update(customerAddress);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return customerAddressService.delete(id);
    }

    @GetMapping("/getall")
    public Set<CustomerAddress> getAll() {
        return customerAddressService.getAll();
    }

}
