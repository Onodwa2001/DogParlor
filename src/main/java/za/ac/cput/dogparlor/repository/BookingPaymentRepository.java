package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.BookingPayment;


import java.util.HashSet;
import java.util.Set;

public class BookingPaymentRepository implements IBookingPaymentRepository {
    private static BookingPaymentRepository repository = null;
    private Set<BookingPayment> BookingPaymentDB = null;

    public BookingPaymentRepository(){
        BookingPaymentDB = new HashSet<BookingPayment>();
    }
    public static BookingPaymentRepository getRepository(){
        if (repository == null){
            repository = new BookingPaymentRepository();
        }
        return repository;
    }
    public BookingPayment create(BookingPayment bookingPayment){
        boolean success = BookingPaymentDB.add(bookingPayment);

        if (!success)
            return null;

        return bookingPayment;
    }
    public BookingPayment read(Integer id){
        return BookingPaymentDB.stream()
                .filter(e -> e.getPaymentID() == id || e.getBookingID() == id)
                .findAny()
                .orElse(null);
    }
    public BookingPayment update(BookingPayment bookingPayment){
        BookingPayment oldBookingPayment = read(bookingPayment.getPaymentID());

        if (oldBookingPayment != null) {
            BookingPaymentDB.remove(oldBookingPayment);
            BookingPaymentDB.add(bookingPayment);
            return bookingPayment;
        }

        return null;
    }

    public BookingPayment delete(BookingPayment bookingPayment){
        BookingPayment bookingPaymentFound = read(bookingPayment.getBookingID());

        if (bookingPaymentFound != null) {
            BookingPaymentDB.remove(bookingPaymentFound);
            return bookingPaymentFound;
        }

        return null;
    }


    @Override
    public Set<BookingPayment> getAllBookingPayments() {
        return BookingPaymentDB;
    }
}
