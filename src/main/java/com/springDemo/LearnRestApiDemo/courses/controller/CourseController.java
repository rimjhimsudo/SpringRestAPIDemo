package com.springDemo.LearnRestApiDemo.courses.controller;

import com.springDemo.LearnRestApiDemo.courses.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController //want o expose web url
public class CourseController {
    //we want to sent specific respond back
    //localhost:8080
    @GetMapping("/courses")
    public List<Courses> getAllCourses(){
        return Arrays.asList(new Courses(1,"Database","DUCS"));

    }

}
