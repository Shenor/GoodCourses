package net.os.goodcourses.controller;

import net.os.goodcourses.entity.Course;
import net.os.goodcourses.entity.Profile;
import net.os.goodcourses.repository.storage.CourseRepository;
import net.os.goodcourses.repository.storage.ProfileRepository;
import net.os.goodcourses.service.AddProfileService;
import net.os.goodcourses.service.FindProfileService;
import net.os.goodcourses.service.impl.AddFeedBackServiceImpl;
import net.os.goodcourses.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddDataController {
    @Autowired
    private AddFeedBackServiceImpl addFeedBackService;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private FindProfileService findProfileService;

    @Autowired
    private AddProfileService addProfileService;

    @Autowired
    private ProfileRepository profileRepository;

    @RequestMapping(value = "/add/feedback", method= RequestMethod.POST)
    public ResponseEntity addFeedBack(@RequestParam("id_course") Long id_course,
                                      @RequestParam("feedback") String feedback) {
        Course course = courseRepository.findById(id_course);
        long uid = SecurityUtil.getCurrentIdProfile();
        Profile profile = profileRepository.findOne(uid);
        addFeedBackService.createNewFeedBack(course, profile, feedback);
        return new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public String signUp(@RequestParam(value = "first_name") String firstName,
                         @RequestParam(value = "last_name") String lastName,
                         @RequestParam(value = "uid") String uid,
                         @RequestParam(value = "password") String password) {
        if (findProfileService.findByUid(uid) == null) {
            Profile profile = addProfileService.createNewProfile(firstName, lastName, uid, password);
            SecurityUtil.authentificate(profile);
            return "redirect:/" + profile.getUid();
        } else {
            return "sign-up";
        }
    }
}
