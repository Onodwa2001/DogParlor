package za.ac.cput.dogparlor.service.impl;






import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.repository.CustomerAddressRepository;
import za.ac.cput.dogparlor.service.CustomerAddressService;

import java.util.Set;

public class BookingServicImpl implements BookingService {

    private static BookingServiceImpl bookingService = null;
    private CustomerAddressRepository bookingRepository = null;

    private BookingServiceImpl() {
        bookingRepository = bookingRepository.getBookingRepository();
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

}
