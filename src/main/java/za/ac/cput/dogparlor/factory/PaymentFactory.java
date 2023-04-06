package za.ac.cput.dogparlor.factory;


import za.ac.cput.dogparlor.domain.Payment;

public class PaymentFactory{
    public static Payment createPayment (int paymentID ,int amount){
        if ( amount == 0)
            return null;
        return new Payment.PaymentBuilder()
                .setPaymentID(paymentID)
                .setAmount (amount)
                .build();
    }
}
