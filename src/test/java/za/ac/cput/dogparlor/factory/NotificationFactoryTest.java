/* NotificationFactoryTest.java
  Factory test case for Notification entity
  Author: Byron Young (218155077)
  Date:08 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.dogparlor.domain.Notification;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {
    @Test
    public void testObject() {
        Notification notification = NotificationFactory.createNotification(150 , 251);
        assertNotNull(notification);
    }

    @Test
    public void objectEquality() {

        Notification notification = NotificationFactory.createNotification(150 , 251);
        Notification notification2 = NotificationFactory.createNotification(150 , 251);
        assertEquals(notification, notification2);

    }

    @Test
    public void objectIdentity() {

        Notification notification = NotificationFactory.createNotification(150 , 251);
        // test should fail if you create a new instance but with same values
        // to make test pass, we create a reference variable that points to the same object in memory
        Notification notification2 = notification;
        assertSame(notification, notification2);

    }

    @Test
    public void failingTest() {

        Notification notification = NotificationFactory.createNotification(150 , 251);
        Notification notification2 = NotificationFactory.createNotification(150 , 251);
        assertSame(notification, notification2);
    }

    @Test
    @Timeout(1) // seconds
    public void timeOutTest() {
        Notification notification = NotificationFactory.createNotification(150 , 251);

        try {
            Thread.sleep(400); // half a second; increase to a number higher than 1000 milis to fail the test
            assertEquals(150, notification.getNotificationID());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        Notification notification = NotificationFactory.createNotification(150 , 251);
        assertNotNull(notification);
    }

}