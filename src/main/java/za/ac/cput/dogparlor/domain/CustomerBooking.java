package za.ac.cput.dogparlor.domain;

import java.util.Objects;

/*
     CustomerAddress.java
     Entity for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

public class CustomerBooking {

    private int customerID, bookingID;

    private CustomerBooking() {}

    private CustomerBooking(Builder builder) {
        this.customerID = builder.customerID;
        this.bookingID = builder.bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getBookingID() {
        return bookingID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBooking that = (CustomerBooking) o;
        return customerID == that.customerID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID);
    }

    @Override
    public String toString() {
        return "CustomerBooking{" +
                "customerID=" + customerID +
                ", bookingID=" + bookingID +
                '}';
    }

    static class Builder {

        private int customerID, bookingID;

        public Builder() {}

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setBookingID(int bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public Builder copy(CustomerBooking customerBooking) {
            this.customerID = customerBooking.customerID;
            this.bookingID = customerBooking.bookingID;
            return this;
        }

        public CustomerBooking build() { return new CustomerBooking(this); }

    }

}
