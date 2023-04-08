/* PaymentTest.java
  Domain test case for Payment entity
  Author: Uthimna Sisipho Rubushe (221044329)
  Date:08 April 2023
 */
package za.ac.cput.dogparlor.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    void testObjectIdentity() {
        Payment payment = new Payment.Builder()
                .setPaymentID(251)
                .setAmount(5000)
                .build();

        Payment payment2 = payment;

        assertSame(payment2, payment);
    }

    @Test
    void testObjectEquality() {
        Payment payment = new Payment.Builder()
                .setPaymentID(251)
                .setAmount(5000)
                .build();

        Payment payment2 = new Payment.Builder()
                .setPaymentID(251)
                .setAmount(5000)
                .build();

        assertEquals(payment, payment2);
    }
}