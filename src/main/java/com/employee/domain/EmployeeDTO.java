package com.employee.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")

public class EmployeeDTO {

	@Id
	private String employeeId;
	private String employeeNm;
	private int age;
	private String country;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
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
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeNm=" + employeeNm + ", age=" + age + ", country="
				+ country + "]";
	}

}
