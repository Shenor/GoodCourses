package net.devstudy.resume.service.impl;

import net.devstudy.resume.entity.Course;
import net.devstudy.resume.entity.FeedBack;
import net.devstudy.resume.entity.Profile;
import net.devstudy.resume.repository.storage.FeedBackRepository;
import net.devstudy.resume.service.AddFeedBackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class AddFeedBackServiceImpl implements AddFeedBackService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddFeedBackServiceImpl.class);

    @Autowired
    FeedBackRepository feedBackRepository;

    @Override
    public FeedBack createNewFeedBack(Course course,
                                      Profile profile,
                                      String description) {
        FeedBack feedBack = new FeedBack();
        feedBack.setCourse(course);
        feedBack.setProfile(profile);
        feedBack.setDescription(description);
        feedBack.setStartDate(new Timestamp(System.currentTimeMillis()));
        feedBackRepository.save(feedBack);
        return feedBack;
    }


}
