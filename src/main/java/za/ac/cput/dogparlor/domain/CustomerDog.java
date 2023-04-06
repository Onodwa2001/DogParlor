/*CustomerDog.java
  Entity for CustomerDog
  Author:Wendy Samsodien (218233779)
  Date:03 April 2023
 */
package za.ac.cput.dogparlor.domain;
public class CustomerDog {
    private int customerID;
    private int dogID;

    private CustomerDog() {}
    private CustomerDog (Builder builder) {
        this.customerID = builder.customerID;
        this.dogID = builder.dogID;
    }
    public int getCustomerID() {
        return customerID;
    }
    public int getDogID() {
        return dogID;
    }
    @Override
    public String toString() {
        return "CustomerDog{" +
                "customerID='" + customerID + '\'' +
                "dogID='" + dogID + '\'' +
                '}';
    }

    //implement builder pattern

    public static class Builder {
        private int customerID;
        private int dogID;

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }
        public Builder setDogID(int dogID) {
            this.dogID = dogID;
            return this;
        }


        public Builder copy(CustomerDog customerDog) {
            this.customerID = customerDog.customerID;
            this.dogID = customerDog.dogID;
            return this;

        }

        public CustomerDog build() {
            return new CustomerDog(this);
        }

    }
}
