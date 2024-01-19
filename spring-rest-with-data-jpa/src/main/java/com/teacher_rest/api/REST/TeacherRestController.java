package com.teacher_rest.api.REST;

import com.teacher_rest.api.Entity.Teacher;
import com.teacher_rest.api.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherRestController {
    private TeacherService teacherService;

    @Autowired
    public TeacherRestController(TeacherService teacherService){
        this.teacherService=teacherService;
    }

    @GetMapping("/teachers")
    List<Teacher> findAll(){
        return teacherService.findAll();
    }

    @GetMapping("/teachers/{id}")
    Teacher findById(@PathVariable int id){
        Teacher teacher=  teacherService.findById(id);
        if (teacher == null){
            throw new RuntimeException("Teacher Not Found With Id"+id);
        }
        return teacher;
    }

    @PostMapping("/teachers")
    Teacher save(@RequestBody Teacher teacher){
        teacher.setId(0);
        return teacherService.save(teacher);
    }

    @PutMapping("/teachers")
    Teacher update (@RequestBody Teacher theTeacher ){
        return teacherService.save(theTeacher);
    }

    @DeleteMapping("/teachers/{id}")
    Teacher deleteById (@PathVariable int id ){
        Teacher teacher = teacherService.findById(id);
        if(teacher == null){
            throw new RuntimeException("Teacher Not Found With Id"+id);
        }
        teacherService.deleteById(id);
        return  teacher;
    }

}
