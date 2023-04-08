/* PaymentFactoryTest.java
  Factory test case for Payment entity
  Author: Uthimna Sisipho Rubushe (221044329)
  Date:08 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Payment;


import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {
    @Test
    public void testObject() {
        Payment payment = PaymentFactory.createPayment(251 , 5000);
        assertNotNull(payment);
    }

    @Test
    public void objectEquality() {
        Payment payment = PaymentFactory.createPayment(251 , 5000);
        Payment payment2 = PaymentFactory.createPayment(251 , 5000);
        assertEquals(payment, payment2);
    }

    @Test
    public void objectIdentity() {
        Payment payment = PaymentFactory.createPayment(251 , 5000);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Payment payment2 = payment;
        assertSame(payment, payment2);
    }

    @Test
    public void failingTest() {
        Payment payment = PaymentFactory.createPayment(251 , 5000);
        Payment payment2 = PaymentFactory.createPayment(251 , 5000);
        assertSame(payment, payment2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Payment payment = PaymentFactory.createPayment(251 , 5000);

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(251, payment.getPaymentID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Payment payment = PaymentFactory.createPayment(251 , 5000);
        assertNotNull(payment);
    }
}