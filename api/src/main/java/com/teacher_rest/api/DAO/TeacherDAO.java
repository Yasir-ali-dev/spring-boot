package com.teacher_rest.api.DAO;

import com.teacher_rest.api.Entity.Teacher;

import java.util.List;

public interface TeacherDAO {
    List<Teacher> findAll ();

    Teacher findById(int id);

    Teacher save(Teacher teacher);

    void deleteById(int id);

}
