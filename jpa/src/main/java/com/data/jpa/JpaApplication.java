package com.data.jpa;

import com.data.jpa.DAO.InstrutorDAO;
import com.data.jpa.Entity.Course;
import com.data.jpa.Entity.Instructor;
import com.data.jpa.Entity.InstructorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private InstrutorDAO instrutorDAO;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<InstructorDetail>  instructorDetails= instrutorDAO.findAllInstructorDetails();
//		instructorDetails.forEach(instructorDetail -> System.out.println(instructorDetail.getInstructor()));
//

		findInstructor();
//		createInstructor();
		/*
		findInstructor();
		deleteInstructor();
		updateInstructor(5);
		System.out.println(instrutorDAO.findAll());
		*/
	}

	public void updateInstructor (int id){
		Instructor instructor = instrutorDAO.findById(id);
		instructor.setEmail("khalid@gmail.com");
		instructor.setLast_name("Hussain Detho");
		instrutorDAO.update(instructor);
	}
	public void findInstructor(){
		Instructor instructor=instrutorDAO.findById(8);
		System.out.println("instructor :"+instructor);
		System.out.println("instrutor courses"+instructor.getCourses());
	}
	public void createInstructor(){
		Instructor instructor = new Instructor("Danyal","Channa","danyal@gmial.com");
		InstructorDetail instructorDetail = new InstructorDetail("Nursing with Danyal","Caring");
		instructor.setInstructorDetail(instructorDetail);

		Course course1 = new Course("Nursing");
		Course course2 = new Course("Biology");
		instructor.add(course1);
		instructor.add(course2);
		instrutorDAO.save(instructor);
	}
	public void deleteInstructor (){
		instrutorDAO.delete(4);
		System.out.println("instructor deleted");
	}
}
