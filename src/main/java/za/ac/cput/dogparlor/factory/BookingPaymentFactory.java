package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.BookingPayment;


public class BookingPaymentFactory {
    public static BookingPayment createBookingPayment(int bookingID, int paymentID) {
        if (bookingID == 0 || paymentID == 0)
            return null;

        return new BookingPayment.Builder()
                .setBookingID(bookingID)
                .setPaymentID(paymentID)
                .build();

    }
}