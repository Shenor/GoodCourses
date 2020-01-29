package net.os.goodcourses.service;

import net.os.goodcourses.model.NotificationMessage;

public interface NotificationTemplateService {

	NotificationMessage createNotificationMessage(String templateName, Object model);
}
