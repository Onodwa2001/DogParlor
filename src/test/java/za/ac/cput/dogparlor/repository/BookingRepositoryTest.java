package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.factory.BookingFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookingRepositoryTest {
    @TestMethodOrder() (MethodOrderer.MethodName.class)
    class BookingRepository {

        private static final BookingRepositoryTest.BookingRepository repository = BookingRepositoryTest.BookingRepository.getBookingRepository();
        private static final Booking = BookingtFactory.createBooking(23,78;

        @org.junit.jupiter.api.Test
        void a_create() {
            Booking createdBooking = repository.create(booking);
            System.out.println(createdBooking);
            assertEquals(Booking.getAmount(), createdBooking.getBookingID());
        }

        @org.junit.jupiter.api.Test
        void b_read() {
            Booking retrievedBooking= repository.read(booking.getBookingID());
            System.out.println(retrievedBooking);
            assertNotNull(retrievedBooking;
        }

        @org.junit.jupiter.api.Test
        void c_update() {
           Booking updated = new Booking().LocationBuilder()
                    .setAmount(2341)
                    .setName("The Hive")
                    .setLongitude("-27.3831")
                    .setLatitude("11.2332")
                    .build();
            System.out.println(updated);
            assertNotNull(repository.c_update(updated););
        }

        @org.junit.jupiter.api.Test
        void e_delete() {
            Booking deleted = repository.delete(booking);
            System.out.println(deleted);
            assertNotNull(deleted);
        }

        @Test
        void d_getAllLocations() {
            Set<Booking> set = repository.getAllLocations();
            System.out.println(set);
            assertNotNull(set);
        }
    }
