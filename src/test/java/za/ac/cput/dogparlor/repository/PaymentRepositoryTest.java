package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Payment;
import za.ac.cput.dogparlor.factory.PaymentFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

<<<<<<< HEAD
@TestMethodOrder(MethodOrderer.MethodName.class)
class PaymentRepositoryTest {

    private static final PaymentRepository repository =PaymentRepository.getPaymentRepository();
    private static final Payment payment = PaymentFactory.createPayment(23,78);

    @Test
    void a_create() {
        Payment createdPayment = repository.create(payment);
        System.out.println(createdPayment);
        assertEquals(Payment.getAmount(), createdPayment.getAmount());
    }

    @Test
    void b_read() {
        Payment retrievedPayment= repository.read(payment.getAmount());
        System.out.println(retrievedPayment);
        assertNotNull(retrievedPayment;
    }

    @Test
    void c_update() {
        Payment updated = new Payment().Builder()
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
        Set<Payment> set = repository.getAllPayments();
        System.out.println(set);
        assertNotNull(set);
    }
}
=======
class PaymentRepositoryTest {
    @TestMethodOrder(MethodOrderer.MethodName.class)
    class PaymentRepository {

        private static final PaymentRepository repository =PaymentRepository.getPaymentRepository();
        private static final Payment payment = PaymentFactory.createPayment(23,78;

        @org.junit.jupiter.api.Test
        void a_create() {
           Payment createdPayment = repository.create(payment);
            System.out.println(createdPayment);
            assertEquals(Payment.getAmount(), createdPayment.getAmount());
        }

        @org.junit.jupiter.api.Test
        void b_read() {
         Payment retrievedPayment= repository.read(payment.getAmount());
            System.out.println(retrievedPayment);
            assertNotNull(retrievedPayment;
        }

        @org.junit.jupiter.api.Test
        void c_update() {
            Payment updated = new Payment().LocationBuilder()
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
            Payment deleted = repository.delete(payment);
            System.out.println(deleted);
            assertNotNull(deleted);
        }

        @Test
        void d_getAllLocations() {
            Set<Payment> set = repository.getAllLocations();
            System.out.println(set);
            assertNotNull(set);
        }
    }


>>>>>>> 74a49f4d495c2fb5363f93c6d1398c3dde6b7f23
