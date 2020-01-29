package net.os.goodcourses.service;



import net.os.goodcourses.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface FindCourseService {

    Course findById(String uid);

    Page<Course> findAll(Pageable pageable);
}
