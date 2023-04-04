package za.ac.cput.dogparlor.domain;

public class CustomerAddress {

    private int customerID, addressID;

    public CustomerAddress() {}

    public CustomerAddress(Builder builder) {
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
