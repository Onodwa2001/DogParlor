package za.ac.cput.dogparlor.domain;

import java.util.Objects;

/*
     CustomerAddress.java
     Entity for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

public class CustomerAddress {

    private int customerID, addressID;

    private CustomerAddress() {}

    private CustomerAddress(Builder builder) {
        this.customerID = builder.customerID;
        this.addressID = builder.addressID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getAddressID() {
        return addressID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAddress that = (CustomerAddress) o;
        return customerID == that.customerID && addressID == that.addressID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, addressID);
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "customerID=" + customerID +
                ", addressID=" + addressID +
                '}';
    }

    public static class Builder {

        private int customerID, addressID;

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setAddressID(int addressID) {
            this.addressID = addressID;
            return this;
        }

        public Builder copy(CustomerAddress customerAddress) {
            this.addressID = customerAddress.addressID;
            this.customerID = customerAddress.customerID;
            return this;
        }

        public CustomerAddress build() {
            return new CustomerAddress(this);
        }

    }

}
