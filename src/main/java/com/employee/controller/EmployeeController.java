package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/test")
	public String test() {
		System.out.println("Service is working");
		return "Service is UP";

	}

	@GetMapping("/readAll")
	public List<Employee> readAllEmployee() {

		List<Employee> employeeList = employeeService.readAllEmployee();
		return employeeList;

	}

	@PostMapping("/create")
	public void createEmployee(@RequestBody Employee employee) {

		employeeService.createEmployee(employee);

	}
//
//	@PutMapping("/update")
//	public String updateEmployee(@RequestBody Employee employee) {
//		employeeService.updateEmployee(employee);
//
//		return "Service is UP";
//
//	}
//
//	@DeleteMapping("/delete")
//	public String deleteEmployee(@RequestBody Employee employee() {
//		employeeService.deleteEmployee(employee);
//
//		return "Service is UP";
//
//	}

}
