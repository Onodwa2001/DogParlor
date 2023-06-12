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

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class NotificationRepositoryTest {

    private static final NotificationRepository repository = NotificationRepository.getNotificationRepository();
    private static final Notification notification = NotificationFactory.createNotification(150, 251);

    @Test
    void a_create() {
        Notification createdNotificaton = repository.create(notification);
        assertEquals(notification.getNotificationID(), createdNotificaton.getNotificationID());
        System.out.println("Created: " + createdNotificaton);
    }

    @Test
    void b_read() {
        Notification retrievedNotification = repository.read(notification.getNotificationID());
        assertNotNull(retrievedNotification);
        System.out.println("Retrieved: " + retrievedNotification);
    }

    @Test
    void c_update() {
        Notification updated = new Notification.Builder().copy(notification)
                .setPaymentID(251)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(notification.getNotificationID());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    void d_getAllNotifications() {
        Set<Notification> set = repository.getAllNotifications();
        System.out.println(set);
        assertNotNull(set);
    }
}
