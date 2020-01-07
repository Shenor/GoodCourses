package net.devstudy.resume.service;

import net.devstudy.resume.entity.Course;
import net.devstudy.resume.entity.FeedBack;
import net.devstudy.resume.entity.Profile;

public interface AddFeedBackService {
    FeedBack createNewFeedBack(Course course,
                               Profile profile,
                               String description);
}
