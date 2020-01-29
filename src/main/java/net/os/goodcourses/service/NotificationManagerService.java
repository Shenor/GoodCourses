package net.os.goodcourses.service;

import net.os.goodcourses.entity.Profile;

/**
 *
 */
public interface NotificationManagerService {

	void sendRestoreAccessLink(Profile profile, String restoreLink);

	void sendPasswordChanged(Profile profile);
}
