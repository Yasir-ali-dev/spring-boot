package com.hibernate.teacher;

import com.hibernate.teacher.DAO.TeacherDAO;
import com.hibernate.teacher.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TeacherApplication implements CommandLineRunner {

	@Autowired
	private TeacherDAO teacherDAO;
	public static void main(String[] args) {
		SpringApplication.run(TeacherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Teacher teacher = new Teacher("GM","NLP");
		teacherDAO.delete(1);
	}
	void createSingleTeacher (Teacher teacher){
		teacherDAO.create(teacher);
	}
	void createMultipleTeachers(List<Teacher> teachers){
		teacherDAO.createMultipleTeachers(teachers);
	}
	void updateTeacher (int id, String name,String course ){
		System.out.println(teacherDAO.update(id,name,course));
	}
}
