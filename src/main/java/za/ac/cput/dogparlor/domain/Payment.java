/* Payment.java
  Entity for the Payment
  Author: Uthimna Sisipho Rubushe (221044329)
  Date:08 April 2023
 */
package za.ac.cput.dogparlor.domain;

import java.util.Objects;

public class Payment {
    private int paymentID;
    private double amount;

    private Payment(){};

    private Payment(Builder builder){
        this.paymentID = builder.paymentID;
        this.amount = builder.amount;
    }
    public int getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment that = (Payment) o;
        return paymentID == that.paymentID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentID);
    }
    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", amount=" + amount +
                '}';
    }

    public static class Builder{
        private int paymentID;
        private double amount;

        public Builder setPaymentID(int paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentID = payment.paymentID;
            this.amount = payment.amount;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }

    }
}
