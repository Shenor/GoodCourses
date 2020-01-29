package net.os.goodcourses.service;

import net.os.goodcourses.entity.Profile;
import net.os.goodcourses.model.NotificationMessage;

public interface NotificationSenderService {

	void sendNotification(NotificationMessage message);

	String getDestinationAddress(Profile profile);
}
