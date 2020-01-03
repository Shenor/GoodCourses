package net.devstudy.resume.repository.storage;

import net.devstudy.resume.entity.Course;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

    Course findById(long id);

    Course findByName(String name);

    Course findBySchool(String school);

}
