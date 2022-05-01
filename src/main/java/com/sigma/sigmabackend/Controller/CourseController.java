package com.sigma.sigmabackend.Controller;

import com.sigma.sigmabackend.Dao.Course.CourseServiceDao;
import com.sigma.sigmabackend.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CourseController {

    @Autowired
    private CourseServiceDao courseServiceDao;

    @PostMapping(value = "/add/course",consumes = "application/json; charset=utf-8")
    public ResponseEntity<?> addCourse(@RequestBody Course course){

        if(courseServiceDao.addCourse(course) != null){
            return new ResponseEntity<Course>(course, HttpStatus.CREATED);
        }
        return new ResponseEntity<String>("Course can't be added",HttpStatus.CONFLICT);
    }

    @GetMapping("/all/course")
    public ResponseEntity<?> getAllCourse(){
      List<Course> course = courseServiceDao.getAllCourse();
      if(course != null && course.size()>0){
          return  new ResponseEntity<List<Course>>(course,HttpStatus.OK);

      }
      return new ResponseEntity<String>("Course List is Empty",HttpStatus.NO_CONTENT);
    }
}
