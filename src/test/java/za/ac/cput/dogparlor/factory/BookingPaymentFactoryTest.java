package za.ac.cput.dogparlor.factory;

import org.junit.Test;
import za.ac.cput.dogparlor.domain.BookingPayment;

import static org.junit.jupiter.api.Assertions.*;

class BookingPaymentFactoryTest {

    @Test
    public void testObject (){
        BookingPayment Bp= BookingPaymentFactory.createBookingPayment(1234,67);
        assertNotNull(Bp);
    }

}