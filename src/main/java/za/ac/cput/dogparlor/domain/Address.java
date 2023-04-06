/* Address.java
  Entity for the Address
  Author: Byron Young (218155077)
  Date:05 April 2023
 */

package za.ac.cput.dogparlor.domain;

import java.util.Objects;

public class Address {
    private int addressID;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    private Address(){};
    private Address(Builder builder){
        this.addressID = builder.addressID;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.country = builder.country;
    }
    public int getAddressID() {
        return addressID;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return addressID == that.addressID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressID);
    }
    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder{
        private int addressID;
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;
        private String country;

        public Builder setAddressID(int addressID) {
            this.addressID = addressID;
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder copy(Address address){
            this.addressID = address.addressID;
            this.streetAddress = address.streetAddress;
            this.city = address.city;
            this.state = address.state;
            this.zipCode = address.zipCode;
            this.country = address.country;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
