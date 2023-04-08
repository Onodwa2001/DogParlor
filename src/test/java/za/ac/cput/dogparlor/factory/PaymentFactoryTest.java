package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Payment;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    public void testObject() {
        Payment P = PaymentFactory.createPayment(89, 36);
        assertNotNull(P);
    }

    @Test
    public void objectEquality() {
        Payment P = PaymentFactory.createPayment(02, 99);
        Payment P2 = PaymentFactory.createPayment(02, 99);
        assertEquals(P, P2);
    }

    @Test
    public void objectIdentity() {
        Payment P = PaymentFactory.createPayment(02, 99);
        Payment P2 = P;
        assertSame(P, P2);
    }

    @Test
    public void failingTest() {
        Payment P = PaymentFactory.createPayment(02, 99);
        Payment P2 = PaymentFactory.createPayment(02, 99);
        assertSame(P, P2);

    }
    @Test
    @Timeout(1)
    public void timeOutTest(){
        Payment P = PaymentFactory.createPayment(02, 99);

        try{
            Thread.sleep(300);
            assertEquals(1045,Payment.getAmount());
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }


    }
    @Ignore
    @Test
    public void ignoreThisTest(){
        Payment P = PaymentFactory.createPayment(02, 99);
        assertNotNull(P);


    }
}

