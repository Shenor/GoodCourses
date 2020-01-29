package net.os.goodcourses.service;

import net.os.goodcourses.entity.Profile;

public interface SocialService<T> {

	Profile loginViaSocialNetwork(T model);
}
