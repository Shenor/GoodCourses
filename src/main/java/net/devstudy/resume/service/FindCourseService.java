package net.devstudy.resume.service;



import net.devstudy.resume.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface FindCourseService {

    Course findById(String uid);

    Page<Course> findAll(Pageable pageable);
}
