package com.miniproject.courseupdationdeletion.Repository;

import com.miniproject.courseupdationdeletion.Entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
    // You can define custom query methods here if needed
//    @Query(value = "SELECT * FROM COURSES c WHERE c.course_id = ?1",
//            nativeQuery = true)
//    Courses findCourseById(int courseId);

    @Query("SELECT c FROM Courses c where c.id=:cid")
    Courses findCourseById(@Param("cid") int cid);




//    @Query(value = "SELECT COUNT(*) > 0 FROM COURSES c WHERE c.course_id=?1", nativeQuery = true)
//    boolean existsById(int courseId);
}