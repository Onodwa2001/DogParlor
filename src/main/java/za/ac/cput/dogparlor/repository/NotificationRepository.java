/*NotificationRepository.java
  Repository class for the Notification
  Author: Karabo Magagula (220042292)
  Date: 08 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Notification;

import java.util.HashSet;
import java.util.Set;

public class NotificationRepository implements INotificationRepository{

    static NotificationRepository notificationRepository = null;

    Set<Notification> DB = null;

    private NotificationRepository() {DB = new HashSet<>();}

    public static NotificationRepository getNotificationRepository() {
        if (notificationRepository == null) {
            notificationRepository = new NotificationRepository();
        }
        return notificationRepository;
    }



    @Override
    public Notification create(Notification notification) {
        boolean success = DB.add(notification);

        if (!success) {
            return null;
        }
        return notification;
    }

    @Override
    public Notification read(Integer integer) {
        return DB.stream()
                .filter(notification -> notification.getNotificationID() == integer)
                .findAny()
                .orElse(null);
    }

    @Override
    public Notification update(Notification notification) {
        Notification oldNotification = read(notification.getNotificationID());

        if (oldNotification != null) {
            DB.remove(oldNotification);
            DB.add(notification);
            return notification;
        }
        return null;
    }

    @Override
    public Notification delete(Notification notification) {
        Notification oldNotification = read(notification.getNotificationID());

        if (oldNotification != null) {
            DB.remove(oldNotification);
            return oldNotification;
        }
        return null;
    }

    @Override
    public Set<Notification> getAllNotifications() {
        return DB;
    }
}
