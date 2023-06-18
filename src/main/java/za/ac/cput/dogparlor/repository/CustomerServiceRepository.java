/*CustomerServiceRepository.java
  Repository class for the Customer Service
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.CustomerService;
import za.ac.cput.dogparlor.domain.Facility;

import java.util.HashSet;
import java.util.Set;

public class CustomerServiceRepository implements ICustomerServiceRepository{

    static CustomerServiceRepository customerServiceRepository = null;

    Set<CustomerService> DB = null;

    private CustomerServiceRepository() {DB = new HashSet<>();}

    public static CustomerServiceRepository getCustomerServiceRepository() {
        if (customerServiceRepository == null) {
            customerServiceRepository = new CustomerServiceRepository();
        }
        return customerServiceRepository;
    }


    @Override
    public CustomerService create(CustomerService customerService) {
        boolean success = DB.add(customerService);

        if (!success) {
            return null;
        }
        return customerService;
    }

    @Override
    public CustomerService read(Integer integer) {
        return DB.stream()
                .filter(customerService -> customerService.getCustomerId() == integer)
                .findAny()
                .orElse(null);
    }

    @Override
    public CustomerService update(CustomerService customerService) {
        CustomerService oldCustomerService = read(customerService.getCustomerId());

        if (oldCustomerService == null)
            return null;

        boolean successfulDelete = DB.remove(oldCustomerService);
        if (!successfulDelete)
            return null;

        boolean successfulAdd = DB.add(customerService);
        if (!successfulAdd)
            return null;

        return customerService;
    }

    @Override
    public boolean delete(Integer integer) {
        CustomerService foundCustomerService = read(integer);

        if (foundCustomerService == null)
            return false;

        return DB.remove(foundCustomerService);

    }
    @Override
    public Set<CustomerService> getAllCustomerServices() {
        return DB;
    }
}
