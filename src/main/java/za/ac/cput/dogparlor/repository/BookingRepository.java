package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Booking;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

<<<<<<< HEAD
public class BookingRepository implements IBookingRepository {
=======
public class BookingRepository {
>>>>>>> 74a49f4d495c2fb5363f93c6d1398c3dde6b7f23
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

    public Booking create (Booking booking){
        boolean success = bookingDB.add(booking);

        if (!success)
            return null;

        return booking;
    }
    public Booking read(Integer id){
        return bookingDB.stream()
                .filter(e -> e.getBookingID() == id)
                .findAny()
                .orElse(null);
    }

    public Booking update(Booking booking){
        Booking oldBooking = read(booking.getBookingID());

        if (oldBooking != null) {
            bookingDB.remove(oldBooking);
            bookingDB.add(booking);
            return booking;
        }

        return null;
    }
    public Booking delete(int id){
        Booking booking = read(id);

        if (booking != null) {
            bookingDB.remove(booking);
            return booking;
        }

        return null;
    }
}
