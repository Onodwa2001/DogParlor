package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Booking;

import java.util.Set;

public interface IBookingRepository extends IRepository<BookingRepository, Integer> {

    Set<Booking> getAllBookings();

}
