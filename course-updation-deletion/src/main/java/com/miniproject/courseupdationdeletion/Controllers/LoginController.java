package com.miniproject.courseupdationdeletion.Controllers;

import com.miniproject.courseupdationdeletion.ResponseBody.CourseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ResponseEntity<List<CourseResponse>> validateUserNamePassword() {

        logger.info("login endpoint");

        try {
            List<CourseResponse> courses = courseService.getAllCourses();
            return new ResponseEntity<>(courses, HttpStatus.OK);
        } catch (Exception e) {
            // Handle the exception and return an appropriate response
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
