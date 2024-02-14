package com.yasir.studentmvc.service;

import com.yasir.studentmvc.dao.StudentRepository;
import com.yasir.studentmvc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    private StudentRepository  studentRepository;

    @Autowired
    public StudentServiceImplementation(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    @Override
    public List<Student> findAll() {
         return studentRepository.findAll();
    }
}
