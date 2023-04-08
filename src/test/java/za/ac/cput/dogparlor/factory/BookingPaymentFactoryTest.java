package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.BookingPayment;
import za.ac.cput.dogparlor.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class BookingPaymentFactoryTest {

    @Test
    public void testObject (){
        BookingPayment Bp= BookingPaymentFactory.createBookingPayment(1234,67);
        assertNotNull(Bp);
    }
    @Test
    public void objectEquality() {
        BookingPayment Bp = BookingPaymentFactory.createBookingPayment(02, 99);
        BookingPayment Bp2 = BookingPaymentFactory.createBookingPayment(02,99);
        assertEquals(Bp, Bp2);
    }

    @Test
    public void objectIdentity() {
        BookingPayment Bp = BookingPaymentFactory.createBookingPayment(02, 99);
        BookingPayment Bp2 = Bp;
        assertSame(Bp, Bp2);
    }

    @Test
    public void failingTest() {
        BookingPayment Bp = BookingPaymentFactory.createBookingPayment(02, 99);
        BookingPayment Bp2 = BookingPaymentFactory.createBookingPayment(02,99);
        assertSame(Bp, Bp2);

    }
    @Test
    @Timeout(1)
    public void timeOutTest(){
        BookingPayment Bp = BookingPaymentFactory.createBookingPayment(02, 99);

        try{
            Thread.sleep(300);
            assertEquals(1045,BookingPayment.getBookingID());
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }


    }
    @Ignore
    @Test
    public void ignoreThisTest(){
        BookingPayment Bp = BookingPaymentFactory.createBookingPayment(02, 99);
        assertNotNull(Bp);


    }
}


