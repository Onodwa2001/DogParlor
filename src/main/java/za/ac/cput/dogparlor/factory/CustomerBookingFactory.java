package za.ac.cput.dogparlor.factory;

/*
     CustomerAddress.java
     Entity for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

import za.ac.cput.dogparlor.domain.CustomerBooking;

public class CustomerBookingFactory {

    public static CustomerBooking createCustomerBooking(int customerID, int bookingID) {
        if (customerID == 0 || bookingID == 0)
            return null;

        return new CustomerBooking.Builder()
                .setCustomerID(customerID)
                .setBookingID(bookingID)
                .build();
    }

}
