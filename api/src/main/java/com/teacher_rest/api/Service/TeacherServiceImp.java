package com.teacher_rest.api.Service;

import com.teacher_rest.api.DAO.TeacherDAO;
import com.teacher_rest.api.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherServiceImp implements TeacherService{
    private  TeacherDAO teacherDAO;

    @Autowired
    public TeacherServiceImp(TeacherDAO teacherDAO){
        this.teacherDAO=teacherDAO;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDAO.findAll();
    }
    @Override
    public Teacher findById(int id) {
        return teacherDAO.findById(id);
    }
    @Override
    @Transactional
    public void deleteById(int id) {
        teacherDAO.deleteById(id);
    }

    @Transactional
    @Override
    public Teacher save(Teacher teacher) {
        return teacherDAO.save(teacher);
    }

}
