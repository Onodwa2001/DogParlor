package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.Notification;
import za.ac.cput.dogparlor.repository.NotificationRepository;
import za.ac.cput.dogparlor.service.NotificationService;

import java.util.Set;

public class NotificationServiceImpl implements NotificationService {

    private static NotificationServiceImpl notificationService;
    private NotificationRepository repository;

    private NotificationServiceImpl() {
        repository = NotificationRepository.getNotificationRepository();
    }

    public static NotificationServiceImpl getInstance() {
        if (notificationService == null)
            notificationService = new NotificationServiceImpl();
        return notificationService;
    }

    @Override
    public Notification create(Notification notification) {
        return repository.create(notification);
    }

    @Override
    public Notification read(Integer id) {
        return repository.read(id);
    }

    @Override
    public Notification update(Notification notification) {
        return repository.update(notification);
    }

    @Override
    public boolean delete(Integer id) {
        return repository.delete(id);
    }

    @Override
    public Set<Notification> getAll() {
        return repository.getAllNotifications();
    }

}
