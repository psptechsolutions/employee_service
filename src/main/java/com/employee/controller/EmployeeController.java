package com.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/test")
	public String test() {
		System.out.println("Service is working");

		return "Service is UP";

	}

}
