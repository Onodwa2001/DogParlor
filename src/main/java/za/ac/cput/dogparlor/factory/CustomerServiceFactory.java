/*CustomerService.java
  Factory class for the Customer Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.CustomerService;

public class CustomerServiceFactory {
    public static CustomerService createCustomerService(int customerId, int serviceId) {
        if (customerId == 0 || serviceId == 0)
            return null;

        return new CustomerService.Builder()
                .setCustomerId(customerId)
                .setServiceId(serviceId)
                .build();
    }
}
