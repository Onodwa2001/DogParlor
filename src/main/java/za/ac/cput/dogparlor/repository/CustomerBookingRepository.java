package za.ac.cput.dogparlor.repository;

/*
     CustomerBookingRepository.java
     Repository for the CustomerBooking
     Author: Onodwa Siyotula (220087016)
     Date: 08 April 2023
 */

import za.ac.cput.dogparlor.domain.CustomerBooking;

import java.util.HashSet;
import java.util.Set;

public class CustomerBookingRepository implements ICustomerBookingRepository {

    static CustomerBookingRepository customerBookingRepository = null;
    private Set<CustomerBooking> DB = null;

    private CustomerBookingRepository() {
        DB = new HashSet<>();
    }

    public static CustomerBookingRepository getCustomerBookingRepository() {
        if (customerBookingRepository == null)
            customerBookingRepository = new CustomerBookingRepository();
        return customerBookingRepository;
    }

    @Override
    public CustomerBooking create(CustomerBooking customerBooking) {
        boolean success = DB.add(customerBooking);

        if (!success)
            return null;

        return customerBooking;
    }

    @Override
    public CustomerBooking read(Integer id) {
        return DB.stream()
                .filter(e -> e.getCustomerID() == id || e.getBookingID() == id)
                .findAny()
                .orElse(null);
    }

    @Override
    public CustomerBooking update(CustomerBooking customerBooking) {
        CustomerBooking oldCustomerBooking = read(customerBooking.getCustomerID());

        if (oldCustomerBooking != null) {
            DB.remove(oldCustomerBooking);
            DB.add(customerBooking);
            return customerBooking;
        }

        return null;
    }

    @Override
    public boolean delete(Integer id) {
        CustomerBooking oldCustomerBooking = read(id);

        if (oldCustomerBooking == null)
            return false;

        return DB.remove(oldCustomerBooking);
    }

    @Override
    public Set<CustomerBooking> getAllCustomerBookings() {
        return DB;
    }

}
