package za.ac.cput.dogparlor.service.impl;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Payment;
import za.ac.cput.dogparlor.factory.PaymentFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.class)
class PaymentServiceImplTest {

    private PaymentServiceImplTest paymentService = null;
    private Payment payment = PaymentFactory.createPayment(778, 768);

    @Test
    void a_create() {
        Payment payment1 = PaymentServiceImplTest.create(payment);
        assertNotNull(payment1);
        System.out.println("Created: " + payment1);
    }

    @Test
    void b_read() {
        Payment payment1 = payment.read(payment.getPaymentID());
        assertNotNull(payment1);
        System.out.println("Read: " + payment1);
    }

    @Test
    void c_update() {
        Payment payment1 = new Payment().Builder().copy(payment)
                .setAddressID(3762)
                .build();
        Payment updated = PaymentServiceImplTest.update(payment1);
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = paymentService.delete(payment.getPaymentID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void d_getAll() {
        Set<Payment> payments = paymentService.getAll();
        assertNotNull(payments);
        System.out.println("All items: " + payments);
    }
}