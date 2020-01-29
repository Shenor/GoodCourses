package net.os.goodcourses.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.os.goodcourses.entity.Profile;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public interface FindProfileService {

	Profile findById(long id);

	Profile findByUid(String uid);

	Page<Profile> findAll(Pageable pageable);

	Iterable<Profile> findAllForIndexing();

//	Page<Profile> findBySearchQuery(String query, Pageable pageable);
}
