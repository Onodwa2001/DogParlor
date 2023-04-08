package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.CustomerBooking;

import java.util.Set;

public interface ICustomerBookingRepository extends IRepository<CustomerBooking, Integer> {

    Set<CustomerBooking> getAllCustomerBookings();

}
