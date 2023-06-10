package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.CustomerBooking;

import java.util.Set;

public interface CustomerBookingService extends IService<CustomerBooking, Integer> {

    Set<CustomerBooking> getAll();

}
