package za.ac.cput.dogparlor.factory;

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
