package za.ac.cput.dogparlor.domain;
public class Payment {
    private int paymentID;
    private double amount;

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
        private int amount;
        
        public PaymentBuilder() {}

        public PaymentBuilder setPaymentID (int payementID){
            this.paymentID = payementID;
            return this;
        }
        public PaymentBuilder setAmount(int amount){
            this.amount = amount;
            return this;
        }
        public Payment build(){
            return new Payment(this);
        }
    }
}

