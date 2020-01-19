package net.devstudy.resume.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpSession;

import net.devstudy.resume.entity.Course;
import net.devstudy.resume.entity.FeedBack;
import net.devstudy.resume.repository.storage.ProfileRepository;
import net.devstudy.resume.service.FindCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import net.devstudy.resume.Constants;
import net.devstudy.resume.entity.Profile;
import net.devstudy.resume.model.CurrentProfile;
import net.devstudy.resume.service.FindProfileService;
import net.devstudy.resume.util.SecurityUtil;

@Controller
public class PublicDataController {

	@Autowired
	private FindProfileService findProfileService;

	@Autowired
	private FindCourseService findCourseService;

	@RequestMapping(value="/{uid}", method=RequestMethod.GET)
	public String getProfile(@PathVariable("uid") String uid, Model model){
		Profile profile = findProfileService.findByUid(uid);
		if(profile == null) {
			return "profile_not_found";
		}
		model.addAttribute("profile", profile);
		return "profile";
	}

	@RequestMapping(value="course/{id}", method=RequestMethod.GET)
	public String getCourse(@PathVariable("id") String id, Model model){
		Course course = findCourseService.findById(id);
		if(course == null) {
			return "course_not_found";
		}
		List<FeedBack> feedBacks = course.getFeedbacks();
		model.addAttribute("feedbacks", feedBacks);
		model.addAttribute("course", course);
		return "course";
	}

	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String getError(){
		return "error";
	}


	@RequestMapping(value = { "/courses" })
	public String courseAll(Model model) {
		Page<Course> courses = findCourseService.findAll(new PageRequest(0, Constants.MAX_PROFILES_PER_PAGE, new Sort("id")));
 		model.addAttribute("courses", courses.getContent());
		model.addAttribute("page", courses);
		if (SecurityUtil.getCurrentIdProfile() != null) {
			model.addAttribute("auth", true);
		}
		return "courses";
	}

	@RequestMapping(value = "/fragment/more", method = RequestMethod.GET)
	public String moreProfiles(Model model,
							   @PageableDefault(size=Constants.MAX_PROFILES_PER_PAGE) @SortDefault(sort="id") Pageable pageable) throws UnsupportedEncodingException {
		Page<Profile> profiles = findProfileService.findAll(pageable);
		model.addAttribute("profiles", profiles.getContent());
		return "fragment/profile-items";
	}

	@RequestMapping(value = "/sign-in")
	public String signIn() {
		CurrentProfile currentProfile = SecurityUtil.getCurrentProfile();
		if(currentProfile != null) {
			return "redirect:/" + currentProfile.getUsername();
		}
		else{
			return "sign-in";
		}
	}

	@RequestMapping(value = "/sign-in-failed")
	public String signInFailed(HttpSession session) {
		if (session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION") == null) {
			return "redirect:/sign-in";
		}
		return "sign-in";
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String signUp() {
		CurrentProfile currentProfile = SecurityUtil.getCurrentProfile();
		if(currentProfile != null) {
			return "redirect:/" + currentProfile.getUsername();
		}
		else{
			return "sign-up";
		}
	}

	@RequestMapping(value = "/sign-up-failed")
	public String signUpFailed(HttpSession session) {
		if (session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION") == null) {
			return "redirect:/sign-up";
		}
		return "sign-up";
	}
}
