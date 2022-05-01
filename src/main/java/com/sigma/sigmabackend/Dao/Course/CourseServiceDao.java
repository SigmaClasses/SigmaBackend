package com.sigma.sigmabackend.Dao.Course;

import com.sigma.sigmabackend.Model.Course;

import java.util.List;

public interface CourseServiceDao {

    public Course addCourse(Course course);

    public Course fetchCourseDetails(int id);

    public List<Course> getAllCourse();

    public boolean updateCourse(Course course,int id);

    public boolean deleteCourse(int id);
}
