//package com.miniproject.courseupdationdeletion.Utility;
//
//import com.miniproject.courseupdationdeletion.Entities.Courses;
//import com.miniproject.courseupdationdeletion.Entities.User;
//import com.miniproject.courseupdationdeletion.Repository.UserRepository;
//import com.miniproject.courseupdationdeletion.ResponseBody.CourseResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//
//@Service
//public class PasswordHasher {
//
//    @Autowired
//    UserRepository userRepo;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//
//    public String getHashedVal(String rawPass){
//        return passwordEncoder.encode(rawPass);
//    }
//}
