package com.yasir.studentmvc.rest;

import com.yasir.studentmvc.entity.Student;
import com.yasir.studentmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    public StudentService studentService;
    @Autowired
    public StudentRestController(StudentService studentService){
        this.studentService=studentService;

    }

    @GetMapping("/")
    public String getAllStudents (){
        List<Student> students = studentService.findAll();
        return "";
    }

}
