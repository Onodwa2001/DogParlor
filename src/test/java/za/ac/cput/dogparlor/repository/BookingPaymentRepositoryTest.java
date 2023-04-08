package za.ac.cput.dogparlor.repository;

import org.junit.Test;
import za.ac.cput.dogparlor.domain.BookingPayment;

import static org.junit.jupiter.api.Assertions.*;

class BookingPaymentRepositoryTest {

    @TestMethodOrder() (MethodOrderer.MethodName.class)
    class BookingPaymentRepository {

        private static final BookingPaymentRepositoryTest.BookingPaymentRepository repository = BookingPaymenyRepositoryTest.BookingPaymentRepository.getBookingPaymentRepository();
        private static final BookingPayment = BookingPaymentFactory.createBookingPayment(89,90)

        @org.junit.jupiter.api.Test
        void a_create() {
            BookingPayment createdBookingPayment = repository.create(bookingPayment);
            System.out.println(createdBookingPayment);
            assertEquals(BookingPayment.getAmount(), createdBookingPayment.getBookingID());
        }

        @org.junit.jupiter.api.Test
        void b_read() {
            BookingPayment retrievedBookingPayment= repository.read(bookingPayment.getBookingID());
            System.out.println(retrievedBookingPayment);
            assertNotNull(retrievedBookingPayment;
        }

        @org.junit.jupiter.api.Test
        void c_update() {
            BookingPayment updated = new BookingPayment().LocationBuilder()
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
            BookingPayment deleted = repository.delete(bookingPayment);
            System.out.println(deleted);
            assertNotNull(deleted);
        }

        @Test
        void d_getAllLocations() {
            Set<BookingPayment> set = repository.getAllLocations();
            System.out.println(set);
            assertNotNull(set);
        }
    }

}

}