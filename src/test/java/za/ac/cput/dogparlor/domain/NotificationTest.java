/* NotificationTest.java
  Domain test case for Notification entity
  Author: Byron Young (218155077)
  Date:08 April 2023
 */
package za.ac.cput.dogparlor.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationTest {
    @Test
    void testObjectIdentity() {
        Notification notification = new Notification.Builder()
                .setNotificationID(150)
                .setPaymentID(251)
                .build();

        Notification notification2 = notification;

        assertSame(notification2, notification);
    }

    @Test
    void testObjectEquality() {
        Notification notification = new Notification.Builder()
                .setNotificationID(150)
                .setPaymentID(251)
                .build();

        Notification notification2 = new Notification.Builder()
                .setNotificationID(150)
                .setPaymentID(251)
                .build();

        assertEquals(notification, notification2);
    }
}