package net.os.goodcourses.service;

import java.util.List;

import net.os.goodcourses.entity.Profile;
import net.os.goodcourses.entity.Skill;
import net.os.goodcourses.entity.SkillCategory;
import net.os.goodcourses.form.SignUpForm;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public interface EditProfileService {

	Profile createNewProfile(SignUpForm signUpForm);
	
	List<Skill> listSkills(long idProfile);

	List<SkillCategory> listSkillCategories();
	
	void updateSkills(long idProfile, List<Skill> skills);
}
