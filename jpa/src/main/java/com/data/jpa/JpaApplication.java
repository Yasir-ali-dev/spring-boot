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
//		createInstructor();
//		findInstructor();
		deleteInstructor();
		System.out.println(instrutorDAO.findAll());
	}
	public void findInstructor(){
		Instructor instructor=instrutorDAO.findById(1);
		System.out.println(instructor.getInstructorDetail());
	}
	public void createInstructor(){
		Instructor instructor = new Instructor("Khalid","Hussain","hussain@gmial.com");
		InstructorDetail instructorDetail = new InstructorDetail("Web Eng","GYM");
		instructor.setInstructorDetail(instructorDetail);
		instrutorDAO.save(instructor);

	}

	public void deleteInstructor (){
		instrutorDAO.delete(4);
		System.out.println("instructor deleted");
	}
}
