package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Payment;

import java.util.Set;

public interface PaymentService extends IService<Payment, Integer> {

    Set<Payment> getAllPayments();

}
