package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Booking;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BookingRepository implements IBookingRepository {
    private static BookingRepository repository = null;
    private Set<Booking> bookingDB = null;


    public BookingRepository(){
        bookingDB = new HashSet<Booking>();
    }

    public static BookingRepository getRepository(){
        if (repository == null){
            repository = new BookingRepository();
        }
        return repository;
    }

    @Override
    public Booking create(Booking booking){
        boolean success = bookingDB.add(booking);

        if (!success)
            return null;

        return booking;
    }

    @Override
    public Booking read(Integer id){
        return bookingDB.stream()
                .filter(e -> e.getBookingID() == id)
                .findAny()
                .orElse(null);
    }

    @Override
    public Booking update(Booking booking){
        Booking oldBooking = read(booking.getBookingID());

        if (oldBooking != null) {
            bookingDB.remove(oldBooking);
            bookingDB.add(booking);
            return booking;
        }

        return null;
    }

    @Override
    public Booking delete(Booking booking){
        Booking readBooking = read(booking.getBookingID());

        if (readBooking != null) {
            bookingDB.remove(booking);
            return booking;
        }

        return null;
    }

    @Override
    public Set<Booking> getAllBookings() {
        return bookingDB;
    }

}
