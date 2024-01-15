package com.hibernate.teacher.DAO;

import com.hibernate.teacher.Entity.Teacher;

import java.util.List;

public interface TeacherDAO {
    void create(Teacher teacher);

    void createMultipleTeachers(List<Teacher> teachers);

    Teacher findById(int id);

    List<Teacher> findAll ();

    List<Teacher> findByName (String name);

    Teacher update (int id , String name, String subject);

    void delete (int id );

}
