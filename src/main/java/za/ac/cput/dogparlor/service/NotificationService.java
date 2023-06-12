package za.ac.cput.dogparlor.service;

import za.ac.cput.dogparlor.domain.Notification;

import java.util.Set;

public interface NotificationService extends IService<Notification, Integer> {

    Set<Notification> getAll();

}
