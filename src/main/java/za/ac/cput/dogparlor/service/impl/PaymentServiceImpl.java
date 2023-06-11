package za.ac.cput.dogparlor.service.impl;



import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.repository.CustomerAddressRepository;
import za.ac.cput.dogparlor.service.CustomerAddressService;

import java.util.Set;

public class BookingServiceImpl implements CustomerAddressService {

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
    public CustomerAddress create(CustomerAddress customerAddress) {
        return bookingRepository.create(customerAddress);
    }

    @Override
    public CustomerAddress read(Integer integer) {
        return bookingRepository.read(integer);
    }

    @Override
    public CustomerAddress update(CustomerAddress customerAddress) {
        return bookingRepository.update(booking);
    }

    @Override
    public boolean delete(Integer integer) {
        return bookingRepository.delete(integer);
    }

    @Override
    public Set<CustomerAddress> getAll() {
        return bookingRepository.getAllPayments();
    }

}

