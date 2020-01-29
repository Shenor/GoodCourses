package net.os.goodcourses.repository.storage;

import net.os.goodcourses.entity.Course;
import net.os.goodcourses.entity.FeedBack;
import net.os.goodcourses.entity.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FeedBackRepository extends PagingAndSortingRepository<FeedBack, Long> {
    FeedBack findById(long id);

    FeedBack findByProfile(Profile profile);

    FeedBack findByCourse(Course course);

}
