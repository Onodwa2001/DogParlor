package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.CustomerBooking;
import za.ac.cput.dogparlor.factory.CustomerBookingFactory;
import za.ac.cput.dogparlor.repository.CustomerBookingRepository;
import za.ac.cput.dogparlor.service.CustomerBookingService;

import java.util.Set;

public class CustomerBookingServiceImpl implements CustomerBookingService {

    private static CustomerBookingServiceImpl customerBookingService = null;
    private CustomerBookingRepository customerBookingRepository = null;

    public CustomerBookingServiceImpl() {
        customerBookingRepository = CustomerBookingRepository.getCustomerBookingRepository();
    }

    public static CustomerBookingServiceImpl getInstance() {
        if (customerBookingService == null)
            customerBookingService = new CustomerBookingServiceImpl();
        return customerBookingService;
    }

    @Override
    public CustomerBooking create(CustomerBooking customerBooking) {
        return customerBookingRepository.create(customerBooking);
    }

    @Override
    public CustomerBooking read(Integer integer) {
        return customerBookingRepository.read(integer);
    }

    @Override
    public CustomerBooking update(CustomerBooking customerBooking) {
        return customerBookingRepository.update(customerBooking);
    }

    @Override
    public boolean delete(Integer integer) {
        return customerBookingRepository.delete(integer);
    }

    @Override
    public Set<CustomerBooking> getAll() {
        return customerBookingRepository.getAllCustomerBookings();
    }

}
