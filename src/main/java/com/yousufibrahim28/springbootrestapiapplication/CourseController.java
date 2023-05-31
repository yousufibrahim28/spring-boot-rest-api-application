package com.yousufibrahim28.springbootrestapiapplication;

/*
*
* http://localhost:8080/courses - API endpoint
*
* this will return list of courses
*
* [{
*   "id" :1,
*   "name": "Spring Boot",
*   "author": "John Doe"
* }]
*
* */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// This annotation is used to create a Rest controller
@RestController
public class CourseController {

    // This annotation maps the request to the url path
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Spring Boot", "John Doe"),
                new Course(2, "DevOps", "Doe John"),
                new Course(3, "AWS", "Jeff Bezos"),
                new Course(4, "GCP", "Sudar Pichai"),
                new Course(5, "Azure", "Satya Nadella")
        );
    }
}
