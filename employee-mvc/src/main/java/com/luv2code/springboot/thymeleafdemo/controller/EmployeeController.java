package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data
	private EmployeeService employeeService;
	@Autowired
	public EmployeeController(EmployeeService employeeService){
		this.employeeService=employeeService;
	}

	@GetMapping("/")
	public String getString() {
		return "index";
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployees = employeeService.findAll();
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);

		return "list-employees";
	}

	@GetMapping("/addForm")
	public String getForm (Model model){
		Employee theEmployee= new Employee();
		model.addAttribute("employee",theEmployee);

		return "employee-form";
	}

	@GetMapping("/formDataEmployeeUpdate")
	public String updateForm( Model model,@RequestParam("employeeId") int id){
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee",employee);
		return "update-form";
	}

	@PostMapping("/save")
	public String addEmployee(@ModelAttribute("employee") Employee employee){
		System.out.println("save" + employee);
		employeeService.save(employee);
		return "redirect:/employees/list";
	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int id ){
		employeeService.deleteById(id);
		return "redirect:/employees/list";
	}

}









