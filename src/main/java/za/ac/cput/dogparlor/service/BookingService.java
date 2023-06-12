package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Booking;

import java.util.Set;

public interface BookingService extends IService<Booking, Integer> {

    Set<Booking> getAllBookings();

}
