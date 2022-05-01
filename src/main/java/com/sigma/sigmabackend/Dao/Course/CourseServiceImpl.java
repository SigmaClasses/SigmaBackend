package com.sigma.sigmabackend.Dao.Course;

import com.sigma.sigmabackend.Model.Course;
import com.sigma.sigmabackend.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseServiceDao{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course addCourse(Course course) {
        if(course != null){
           courseRepository.saveAndFlush(course);
           return course;
        }
        return null;
    }

    @Override
    public Course fetchCourseDetails(int id) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isPresent()){
            return course.get();
        }
        return null;
    }

    @Override
    public List<Course> getAllCourse() {
        List<Course> courses = courseRepository.findAll();
        if (courses != null && courses.size()>0){
            return courses;
        }
        return null;
    }

    @Override
    public boolean updateCourse(Course course, int id) {
        Course existingCourse = courseRepository.getById(id);
        if(existingCourse != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCourse(int id) {
        courseRepository.deleteById(id);
        return true;
    }
}
