package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> readAllEmployee() {
		return employeeRepository.findAll();
	}

	public void createEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

}
