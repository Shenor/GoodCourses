package net.os.goodcourses.repository.storage;

import org.springframework.data.repository.CrudRepository;

import net.os.goodcourses.entity.ProfileRestore;

/**
 *
 */
public interface ProfileRestoreRepository extends CrudRepository<ProfileRestore, Long> {
	
	ProfileRestore findByToken(String token);
}
