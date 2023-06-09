package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Payment;

import java.util.Set;

public interface IPaymentRepository extends IRepository<Payment, Integer> {
    Payment delete(Payment payment);

    Set<Payment> getAllPayments();
}
