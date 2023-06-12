package za.ac.cput.dogparlor.domain;
public class Payment {
    private int paymentID;
    private double amount;

    private Payment() {}

    private Payment (PaymentBuilder builder){
        this.paymentID = builder.paymentID;
        this.amount = builder.amount;
    }

    public int getPaymentID(){
        return paymentID;
    }

    public double getAmount(){
        return amount;
    }



    public static class PaymentBuilder{
        private int paymentID;
        private double amount;
        
        public PaymentBuilder() {}

        public PaymentBuilder setPaymentID (int paymentID){
            this.paymentID = paymentID;
            return this;
        }

        public PaymentBuilder setAmount(int amount){
            this.amount = amount;
            return this;
        }

        public PaymentBuilder copy(Payment payment) {
            this.paymentID = payment.paymentID;
            this.amount = payment.amount;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
}

