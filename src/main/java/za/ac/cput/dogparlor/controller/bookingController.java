package za.ac.cput.dogparlor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.factory.BookingFactory;
import za.ac.cput.dogparlor.service.BookingService;

import java.util.Set;

@RestController
@RequestMapping("/booking")
public class bookingController {

    @Autowired
    private BookingService service;

    @PostMapping("/create")
    public Booking create(@RequestBody Booking booking) {
        Booking createdBooking = BookingFactory.createBooking(booking.getBookingID(), booking.getTime(),
                booking.getDate(), booking.getTime(), booking.getTotal());

        return service.create(createdBooking);
    }

    @GetMapping("/read/{id}")
    public Booking read(@PathVariable int id) {
        return service.read(id);
    }

    @PostMapping("/update")
    public Booking update(@RequestBody Booking booking) {
        return service.update(booking);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getall")
    public Set <Booking> getAll() {
        return service.getAllBookings();
    }
}