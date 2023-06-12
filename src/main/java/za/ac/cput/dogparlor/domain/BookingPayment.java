package za.ac.cput.dogparlor.domain;
public class BookingPayment {
    private int bookingID;
    private int paymentID;

    private BookingPayment(Builder builder){
        this.bookingID = builder.bookingID;
        this.paymentID= builder.paymentID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public int getPaymentID() {
        return paymentID;
    }
    public static class Builder{
        private int bookingID;
        private int paymentID;
        
        public Builder() {}

        public Builder setBookingID(int bookingID){
            this.bookingID = bookingID;
            return this;
        }
        public Builder setPaymentID(int paymentID){
            this.paymentID = paymentID;
            return this;
        }
        public BookingPayment build(){
            return new BookingPayment(this);
        }

    }
}
