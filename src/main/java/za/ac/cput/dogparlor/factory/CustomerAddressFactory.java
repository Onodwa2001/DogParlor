package za.ac.cput.dogparlor.factory;

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
