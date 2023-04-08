package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.BookingPayment;

import java.util.Set;

public interface IBookingPaymentRepository extends IRepository<BookingPayment, Integer> {

    Set<BookingPayment> getAllBookingPayments();

}
