package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	private Integer employeeId;
	private String employeeNm;
	private int age;
	private String country;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeNm() {
		return employeeNm;
	}

	public void setEmployeeNm(String employeeNm) {
		this.employeeNm = employeeNm;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeNm=" + employeeNm + ", age=" + age + ", country="
				+ country + "]";
	}

}
