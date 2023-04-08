/* PaymentFactory.java
   Factory for the Payment entity
   Author: Uthimna Sisipho Rubushe (221044329)
   Date:08 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Payment;

public class PaymentFactory {
    public static Payment createPayment(int paymentID, double amount) {
        if (paymentID == 0)
            return null;

        return new Payment.Builder()
                .setPaymentID(paymentID)
                .setAmount(amount)
                .build();
    }
}
