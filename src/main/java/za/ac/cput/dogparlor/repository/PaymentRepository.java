package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Payment;


import java.util.HashSet;
import java.util.Set;

public class PaymentRepository implements IPaymentRepository {

    static PaymentRepository paymentRepository = null;
    Set<Payment> DB = null;

    private PaymentRepository() {
        DB = new HashSet<>();
    }

    public static PaymentRepository  getPaymentRepository() {
        if (paymentRepository == null) {
            paymentRepository = new PaymentRepository();
        }
        return paymentRepository;
    }

    @Override
    public Payment create(Payment payment) {
        boolean success = DB.add(payment);

        if (!success) {
            return null;
        }

        return payment;
    }

    @Override
    public Payment read(Integer id) {
        return DB.stream()
                .filter( Payment -> Payment.getAmount() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public Payment update(Payment payment) {
        Payment oldPayment = read(payment.getPaymentID());

        if (oldPayment != null) {
            DB.remove(oldPayment);
            DB.add(payment);
            return payment;
        }

        return null;
    }

    @Override
    public Payment delete(Payment payment) {
        Payment oldPayment = read(payment.getPaymentID());

        if (oldPayment != null) {
            DB.remove(oldPayment);
            return oldPayment;
        }

        return null;
    }

    @Override
    public Set<Payment> getAllPayments() {
        return DB;
    }
}


