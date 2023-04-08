/* Notification.java
  Entity for the Notification
  Author: Byron Young (218155077)
  Date:08 April 2023
 */
package za.ac.cput.dogparlor.domain;

import java.util.Objects;

public class Notification {
    private int notificationID;
    private int paymentID;

    private Notification(){};

    private Notification(Builder builder){
        this.notificationID = builder.notificationID;
        this.paymentID = builder.paymentID;

    }

    public int getNotificationID() {
        return notificationID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return notificationID == that.notificationID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationID);
    }

    @Override
    public String toString() {
        return "Notifcation{" +
                "notificationID=" + notificationID +
                ", paymentID=" + paymentID +
                '}';
    }

    public static class Builder{
        private int notificationID;
        private int paymentID;

        public Builder setNotificationID(int notificationID) {
            this.notificationID = notificationID;
            return this;
        }

        public Builder setPaymentID(int paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder copy(Notification notification){
            this.notificationID = notification.notificationID;
            this.paymentID = notification.paymentID;
            return this;
        }

        public Notification build(){
            return new Notification(this);
        }
    }
}
