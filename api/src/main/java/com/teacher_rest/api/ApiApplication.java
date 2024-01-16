package com.teacher_rest.api;

import com.teacher_rest.api.DAO.TeacherDAO;
import com.teacher_rest.api.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	private TeacherDAO teacherDAO;
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Teacher teacher = new Teacher("Muhammad","Hussain","hussain@yahoo.com");
//		createTeacher(teacher);
//		System.out.println(teacherDAO.findAll());

	}
	void createTeacher (Teacher teacher){
		teacherDAO.save(teacher);
	}
}
