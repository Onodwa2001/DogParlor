/*Customer.java
  Entity for Customer
  Author:Wendy Samsodien (218233779)
  Date:03 April 2023
 */

package za.ac.cput.dogparlor.domain;
public class Customer {
    private int customerID;

    private Customer() {}
    private Customer (Builder builder) {
        this.customerID = builder.customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                '}';
    }

    //implement builder pattern

    public static class Builder {
        private int customerID;

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder copy(Customer customer) {
            this.customerID = customer.customerID;
            return this;

        }

        public Customer build() {
            return new Customer(this);
        }

    }
}
