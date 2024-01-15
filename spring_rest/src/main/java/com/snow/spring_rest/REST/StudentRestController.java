package com.snow.spring_rest.REST;

import com.snow.spring_rest.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    List<Student> getStudents(){
        List<Student> list= new ArrayList<>();
        Student s1 =new Student("Yasir","Ali");
        Student s2 =new Student("Nasiq","Awan");
        Student s3 =new Student("Hussain","Khan");
        list.add(s1); list.add(s2); list.add(s3);
        return list;
    }
    @GetMapping("/students/{studentId}")
    Student getStudent (@PathVariable int studentId){
        List<Student> list= new ArrayList<>();
        list.add(new Student("Yasir","Ali"));
        list.add(new Student("Nasir","Ali"));
        list.add(new Student("Hia","Noor"));
        return list.get(studentId);
    }
    @GetMapping("/path/{variable}")
    String get(@PathVariable  String variable ){
        return variable;
    }


}
