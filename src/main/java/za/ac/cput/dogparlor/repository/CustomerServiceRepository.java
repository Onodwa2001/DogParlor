/*CustomerServiceRepository.java
  Repository class for the Customer Service
  Author: Karabo Magagula (220042292)
  Date: 06 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.CustomerService;

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

        if(oldCustomerService != null) {
            DB.remove(oldCustomerService);
            DB.add(customerService);
            return customerService;
        }
        return null;
    }

    @Override
    public CustomerService delete(CustomerService customerService) {
        CustomerService oldCustomerService = read(customerService.getCustomerId());

        if (oldCustomerService != null) {
            DB.remove(oldCustomerService);
            return oldCustomerService;
        }
        return null;
    }
    @Override
    public Set<CustomerService> getAllCustomerServices() {
        return DB;
    }
}
