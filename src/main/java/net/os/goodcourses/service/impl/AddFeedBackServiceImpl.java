package net.os.goodcourses.service.impl;

import net.os.goodcourses.entity.Course;
import net.os.goodcourses.entity.FeedBack;
import net.os.goodcourses.entity.Profile;
import net.os.goodcourses.repository.storage.FeedBackRepository;
import net.os.goodcourses.service.AddFeedBackService;
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
