package za.ac.cput.dogparlor.service.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.Notification;
import za.ac.cput.dogparlor.factory.NotificationFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceImplTest {

    private NotificationServiceImpl notificationService = NotificationServiceImpl.getInstance();
    private Notification notification = NotificationFactory.createNotification(423324, 34532);

    @Test
    void create() {
        Notification notification1 = notificationService.create(notification);
        assertNotNull(notification1);
        System.out.println("Created: " + notification1);
    }

    @Test
    void read() {
        Notification notification1 = notificationService.read(notification.getNotificationID());
        assertNotNull(notification1);
        System.out.println("Retrieved: " + notification1);
    }

    @Test
    void update() {
        Notification notification1 = new Notification.Builder().copy(notification)
                .setPaymentID(42232)
                .build();

        Notification updated = notificationService.create(notification1);
        System.out.println("Updated: " + updated);
    }

    @Test
    void delete() {
        boolean deleted = notificationService.delete(notification.getNotificationID());
        assertTrue(deleted);
        System.out.println("Deleted: " + (deleted ? "Yes" : "No"));
    }

    @Test
    void getAll() {
        Set<Notification> notifications = notificationService.getAll();
        assertNotNull(notifications);
        System.out.println("Notifications: " + notifications);
    }

}