package za.ac.cput.dogparlor.factory;

/*
     CustomerAddress.java
     Entity for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

import za.ac.cput.dogparlor.domain.CustomerAddress;

public class CustomerAddressFactory {

    public static CustomerAddress createCustomerAddress(int customerID, int addressID) {
        if (customerID == 0 || addressID == 0)
            return null;

        return new CustomerAddress.Builder()
                .setCustomerID(customerID)
                .setAddressID(addressID)
                .build();
    }

}
