package za.ac.cput.dogparlor.factory;

import org.junit.Test;
import za.ac.cput.dogparlor.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    public void testObject(){
        Payment P = PaymentFactory.createPayment(89,36);
        assertNotNull(P);
    }

}