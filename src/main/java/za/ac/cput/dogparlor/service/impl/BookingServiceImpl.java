package za.ac.cput.dogparlor.service.impl;



import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.repository.BookingRepository;
import za.ac.cput.dogparlor.repository.CustomerAddressRepository;
import za.ac.cput.dogparlor.service.BookingService;
import za.ac.cput.dogparlor.service.CustomerAddressService;

import java.util.Set;

public class BookingServiceImpl implements BookingService {

    private static BookingServiceImpl bookingService = null;
    private BookingRepository bookingRepository = null;

    private BookingServiceImpl() {
        bookingRepository = bookingRepository.getRepository();
    }

    public static BookingServiceImpl getInstance() {
        if (bookingService == null) {
            bookingService = new BookingServiceImpl();
        }
        return bookingService;
    }

    @Override
    public Booking create(Booking booking) {
        return bookingRepository.create(booking);
    }

    @Override
    public Booking read(Integer id) {
        return bookingRepository.read(id);
    }

    @Override
    public Booking update(Booking booking) {
        return bookingRepository.update(booking);
    }

    @Override
    public boolean delete(Integer id) {
        return bookingRepository.delete(id);
    }

    @Override
    public Set<Booking> getAllBookings() {
        return bookingRepository.getAllBookings();
    }

}
