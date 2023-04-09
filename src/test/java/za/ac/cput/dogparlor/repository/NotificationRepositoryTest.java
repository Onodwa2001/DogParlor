/*NotificationRepositoryTest.java
  Repository test for the Notification
  Author: Karabo Magagula (220042292)
  Date: 08 April 2023
 */
package za.ac.cput.dogparlor.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.dogparlor.domain.Notification;
import za.ac.cput.dogparlor.factory.NotificationFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
class NotificationRepositoryTest {

    private static final NotificationRepository repository = NotificationRepository.getNotificationRepository();
    private static final Notification notification = NotificationFactory.createNotification(150, 251);

    @Test
    void a_create() {
        Notification createdNotificaton = repository.create(notification);
        System.out.println(createdNotificaton);
        assertEquals(notification.getNotificationID(), createdNotificaton.getNotificationID());
    }

    @Test
    void b_read() {
        Notification retrievedNotification = repository.read(notification.getNotificationID());
        System.out.println(retrievedNotification);
        assertNotNull(retrievedNotification);
    }

    @Test
    void c_update() {
        Notification updated = new Notification.Builder()
                .setNotificationID(150)
                .setPaymentID(251)
                .build();
        System.out.println(updated);
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        Notification deleted = repository.delete(notification);
        System.out.println(deleted);
        assertNotNull(deleted);
    }

    @Test
    void d_getAllNotifications() {
        Set<Notification> set = repository.getAllNotifications();
        System.out.println(set);
        assertNotNull(set);
    }
}
