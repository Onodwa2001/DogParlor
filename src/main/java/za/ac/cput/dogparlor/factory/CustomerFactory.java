/*CustomerFactory.java
  Factory for the Customer
  Author:Wendy Samsodien (218233779)
  Date:03 April 2023
 */
package za.ac.cput.dogparlor.factory;

        import za.ac.cput.dogparlor.domain.Customer;
public class CustomerFactory {
    public static Customer createCustomer(int customerID){

        if (customerID == 0)
            return null;

        return new Customer.Builder().setCustomerID(customerID)
                .build();
    }
}