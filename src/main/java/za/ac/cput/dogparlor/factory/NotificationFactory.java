/* NotificationFactory.java
   Factory for the Notification entity
   Author: Byron Young (218155077)
   Date:08 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Notification;


public class NotificationFactory {
    public static Notification createNotification(int notificationID, int paymentID) {
        if (notificationID == 0 || paymentID == 0 )
            return null;

        return new Notification.Builder()
                .setNotificationID(notificationID)
                .setPaymentID(paymentID)
                .build();
    }
}
