//package com.miniproject.courseupdationdeletion.Service;
//
//import ch.qos.logback.core.net.SyslogOutputStream;
//import com.miniproject.courseupdationdeletion.Entities.User;
//import com.miniproject.courseupdationdeletion.Exception.EntityNotFoundException;
//import com.miniproject.courseupdationdeletion.Exception.UserNotFoundException;
//import com.miniproject.courseupdationdeletion.Exception.UserUnauthorizedException;
//import com.miniproject.courseupdationdeletion.Repository.UserRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import com.miniproject.courseupdationdeletion.Constants.AllConstants;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//
//@Service
//public class UserServiceImpl implements UserDetailsService {
//    @Autowired
//    private final UserRepository userRepo;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//    @Autowired
//    PasswordHasher passHash;
//    @Autowired
//    public UserServiceImpl(UserRepository userRepo) {
//        this.userRepo = userRepo;
//    }
//
//    User user=new User();
//
//    @Override
//    public User loadUserByUsername(String email) {
//        storeHashedPasswords();
//
//        user=userRepo.findByEmail(email);
//        return user;
//
////        if(user==null || !user.getType().equalsIgnoreCase("ADMIN"))
////            try {
////                throw new UserNotFoundException("User does not exist!");
////            } catch (UserNotFoundException e) {
////                throw new RuntimeException(e);
////            }
//
//    }
//
//    public void storeHashedPasswords(){
//        System.out.println("Inside hash pwd method");
//        String encodedPass;
//        List<User> userList=userRepo.getAllUsers();
//        for (User user : userList) {
//            encodedPass = passwordEncoder.encode(user.getPassword());
//            user.setPassword(encodedPass);
//        }
//
//        userRepo.saveAll(userList);
//    }
//}
