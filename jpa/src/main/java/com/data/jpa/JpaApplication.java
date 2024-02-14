package com.data.jpa;

import com.data.jpa.DAO.InstrutorDAO;
import com.data.jpa.Entity.Instructor;
import com.data.jpa.Entity.InstructorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private InstrutorDAO instrutorDAO;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hi");
		createInstructor();

	}
	public void createInstructor(){
		Instructor instructor = new Instructor("Ghulam","Mujtaba","mujtaba@gmial.com");
		InstructorDetail instructorDetail = new InstructorDetail("Tech Talk","Leetcode");
		instructor.setInstructorDetail(instructorDetail);
		instrutorDAO.save(instructor);

	}
}
