package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.BookingPayment;

import java.util.Set;

public interface BookingPaymentService extends IService<BookingPayment, Integer> {

    Set<BookingPayment> getAllBookingPayments();

}
