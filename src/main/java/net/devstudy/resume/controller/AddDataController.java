package net.devstudy.resume.controller;

import net.devstudy.resume.entity.Course;
import net.devstudy.resume.entity.Profile;
import net.devstudy.resume.repository.storage.CourseRepository;
import net.devstudy.resume.repository.storage.ProfileRepository;
import net.devstudy.resume.service.impl.AddFeedBackServiceImpl;
import net.devstudy.resume.util.SecurityUtil;
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
}
