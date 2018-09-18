package com.prokarma.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prokarma.model.Employee;
import com.prokarma.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/getEmployee")
	public Optional<Employee> getEmployeeDetails() {
		return employeeRepository.findById(540);
	}
	@RequestMapping("/getHome")
	public String getHomepage() {
		return "home";
	}


	@GetMapping("/getAllEmployees")
	public Iterable<Employee> getAllEmployeeDetails() {
		return employeeRepository.findAll();
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return employeeRepository.findById(id).orElse(new Employee());
	}

}
