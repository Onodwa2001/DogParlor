/*INotificationRepository.java
  Interface for the Notification
  Author: Karabo Magagula (220042292)
  Date: 08 April 2023
 */
package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Notification;

import java.util.Set;

public interface INotificationRepository extends IRepository<Notification, Integer> {

    Set<Notification> getAllNotifications();
}
