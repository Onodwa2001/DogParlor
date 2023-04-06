
/*CustomerDogFactory.java
  Factory for the CustomerDog
  Author:Wendy Samsodien (218233779)
  Date:03 April 2023
 */
package za.ac.cput.dogparlor.factory;
import za.ac.cput.dogparlor.domain.CustomerDog;
public class CustomerDogFactory {
    public static CustomerDog createCustomerDog(int customerID ,int dogID){
        if (customerID == 0 || dogID == 0)
            return null;

        return new CustomerDog.Builder().setCustomerID(customerID)
                .setDogID(dogID)
                .build();
    }
}