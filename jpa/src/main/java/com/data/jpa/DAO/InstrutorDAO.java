package com.data.jpa.DAO;

import com.data.jpa.Entity.Course;
import com.data.jpa.Entity.Instructor;
import com.data.jpa.Entity.InstructorDetail;

import java.util.List;

public interface InstrutorDAO {
    void save(Instructor instructor);
    Instructor findById(int id);
    void delete (int id);
    List<Instructor> findAll();
    Instructor update (Instructor instructor);
    InstructorDetail findInstructorDetailById(int id);
    List<InstructorDetail> findAllInstructorDetails();
    List<Course> findCoursesByInstructorId(int id);
}

