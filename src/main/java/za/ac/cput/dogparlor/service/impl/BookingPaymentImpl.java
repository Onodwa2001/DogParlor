package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.domain.BookingPayment;
import za.ac.cput.dogparlor.repository.BookingPaymentRepository;
import za.ac.cput.dogparlor.service.BookingPaymentService;
import za.ac.cput.dogparlor.service.BookingService;

import java.util.Set;

public class BookingPaymentImpl implements BookingPaymentService {

    private static BookingPaymentImpl bookingPaymentImpl = null;
    private BookingPaymentRepository bookingPaymentRepository = null;

    public BookingPaymentImpl() {
        bookingPaymentRepository = BookingPaymentRepository.getRepository();
    }

    public static BookingPaymentImpl getInstance() {
        if (bookingPaymentImpl == null)
            bookingPaymentImpl = new BookingPaymentImpl();
        return bookingPaymentImpl;
    }

    @Override
    public BookingPayment create(BookingPayment bookingPayment) {
        return bookingPaymentRepository.create(bookingPayment);
    }

    @Override
    public BookingPayment read(Integer id) {
        return bookingPaymentRepository.read(id);
    }

    @Override
    public BookingPayment update(BookingPayment bookingPayment) {
        return bookingPaymentRepository.update(bookingPayment);
    }

    @Override
    public boolean delete(Integer id) {
        return bookingPaymentRepository.delete(id);
    }

    @Override
    public Set<BookingPayment> getAllBookingPayments() {
        return bookingPaymentRepository.getAllBookingPayments();
    }

}
