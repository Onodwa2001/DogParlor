package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Booking;
import za.ac.cput.dogparlor.domain.BookingPayment;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {
    @Test
    public void testObject (){
        Booking B = BookingFactory.createBooking(2034,20,9 ,9,500);
        assertNotNull(B);
    }
    @Test
    public void objectEquality() {
        Booking B = BookingFactory.createBooking(0245, 7,8,23);
        Booking B2 = BookingFactory.createBooking(0245,7,8,23;
        assertEquals(B, B2);
    }

    @Test
    public void objectIdentity() {
        Booking B = BookingFactory.createBooking(0245, 7,8,23);
        Booking B2 = B;
        assertSame(B, B2);
    }

    @Test
    public void failingTest() {
        Booking B = BookingFactory.createBooking(0245, 7,8,23);
        Booking B2 = BookingFactory.createBooking(0245,7,8,23;
        assertSame(B, B2);

    }
    @Test
    @Timeout(1)
    public void timeOutTest(){
        Booking B = BookingFactory.createBooking(0245, 7,8,23);


        try{
            Thread.sleep(300);
            assertEquals(1045,Booking.getDate());
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }


    }
    @Ignore
    @Test
    public void ignoreThisTest(){

        Booking B = BookingFactory.createBooking(0245, 7,8,23);

        assertNotNull(B);


    }
}


}