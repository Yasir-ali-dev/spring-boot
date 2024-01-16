package com.teacher_rest.api.Service;

import com.teacher_rest.api.Entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll ();

    void deleteById(int id);

    Teacher findById(int id);

    Teacher save(Teacher teacher);



}
