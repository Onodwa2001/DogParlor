package za.ac.cput.dogparlor.service.impl;



import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.domain.Payment;
import za.ac.cput.dogparlor.repository.CustomerAddressRepository;
import za.ac.cput.dogparlor.repository.PaymentRepository;
import za.ac.cput.dogparlor.service.CustomerAddressService;
import za.ac.cput.dogparlor.service.PaymentService;

import java.util.Set;

public class PaymentServiceImpl implements PaymentService {

    private static PaymentServiceImpl paymentService = null;
    private PaymentRepository paymentRepository = null;

    private PaymentServiceImpl() {
        paymentRepository = paymentRepository.getPaymentRepository();
    }

    public static PaymentServiceImpl getInstance() {
        if (paymentService == null) {
            paymentService = new PaymentServiceImpl();
        }
        return paymentService;
    }

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.create(payment);
    }

    @Override
    public Payment read(Integer id) {
        return paymentRepository.read(id);
    }

    @Override
    public Payment update(Payment payment) {
        return paymentRepository.update(payment);
    }

    @Override
    public boolean delete(Integer id) {
        return paymentRepository.delete(id);
    }

    @Override
    public Set<Payment> getAllPayments() {
        return paymentRepository.getAllPayments();
    }

}

