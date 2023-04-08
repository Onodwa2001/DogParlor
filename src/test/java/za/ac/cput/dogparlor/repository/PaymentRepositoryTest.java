package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Payment;
import za.ac.cput.dogparlor.factory.PaymentFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PaymentRepositoryTest {

    private static final PaymentRepository repository = PaymentRepository.getPaymentRepository();
    private static final Payment payment = PaymentFactory.createPayment(23,78);

    @Test
    void a_create() {
        Payment createdPayment = repository.create(payment);
        System.out.println(createdPayment);
        assertEquals(payment.getPaymentID(), createdPayment.getPaymentID());
    }

    @Test
    void b_read() {
        Payment retrievedPayment= repository.read(payment.getPaymentID());
        System.out.println(retrievedPayment);
        assertNotNull(retrievedPayment);
    }

    @Test
    void c_update() {
        Payment updated = new Payment.Builder()
                .setPaymentID(8839)
                .setAmount(2331)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        Payment deleted = repository.delete(payment);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllPayments() {
        Set<Payment> set = repository.getAllPayment();
        System.out.println(set);
        assertNotNull(set);
    }
}