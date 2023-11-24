package com.miniproject.courseupdationdeletion.Repository;

import com.miniproject.courseupdationdeletion.Entities.Courses;
import com.miniproject.courseupdationdeletion.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {

//    @Query("SELECT u FROM User u where u.email=:email")
//    User findUserByEmail(@Param("email") String email);

//    public User findByEmail(String email);

    @Query(value = "SELECT * FROM users WHERE usr_email = :email", nativeQuery = true)
    User findByEmail(@Param("email") String email);

    @Query(value = "SELECT * FROM users", nativeQuery = true)
    List<User> getAllUsers();
}
