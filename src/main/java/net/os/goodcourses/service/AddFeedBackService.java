package net.os.goodcourses.service;

import net.os.goodcourses.entity.Course;
import net.os.goodcourses.entity.FeedBack;
import net.os.goodcourses.entity.Profile;

public interface AddFeedBackService {
    FeedBack createNewFeedBack(Course course,
                               Profile profile,
                               String description);
}
