package net.devstudy.resume.repository.storage;

import net.devstudy.resume.entity.Course;
import net.devstudy.resume.entity.FeedBack;
import net.devstudy.resume.entity.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FeedBackRepository extends PagingAndSortingRepository<FeedBack, Long> {
    FeedBack findById(long id);

    FeedBack findByProfile(Profile profile);

    FeedBack findByCourse(Course course);

}
