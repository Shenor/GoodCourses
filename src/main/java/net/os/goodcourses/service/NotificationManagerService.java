package net.os.goodcourses.service;

import net.os.goodcourses.entity.Profile;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public interface NotificationManagerService {

	void sendRestoreAccessLink(Profile profile, String restoreLink);

	void sendPasswordChanged(Profile profile);
}
