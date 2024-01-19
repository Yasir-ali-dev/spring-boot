package com.teacher_rest.api.Service;

import com.teacher_rest.api.DAO.TeacherRespository;
import com.teacher_rest.api.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImp implements TeacherService{
    private TeacherRespository teacherRespository;

    @Autowired
    public TeacherServiceImp(TeacherRespository teacherRespository){
        this.teacherRespository=teacherRespository;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRespository.findAll();
    }
    @Override
    public Teacher findById(int id) {
        Optional< Teacher> result= teacherRespository.findById(id);
        Teacher teacher=null;
        if(result.isPresent()){
            teacher=result.get();
        }else{
            throw new RuntimeException("Teacher not foiund with id "+id);

        }
        return  teacher;
    }
    @Override
    @Transactional
    public void deleteById(int id) {
        teacherRespository.deleteById(id);
    }

    @Transactional
    @Override
    public Teacher save(Teacher teacher) {
        return teacherRespository.save(teacher);
    }

}
