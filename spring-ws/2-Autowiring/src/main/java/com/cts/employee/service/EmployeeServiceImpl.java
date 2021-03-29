package com.cts.employee.service;

import javax.sound.midi.Track;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

	private int empId;
	private String empName;
	private double salary;

	
	@Autowired(required = true) // use only in dependent classes to inject dependency
	private DepartmentServiceImpl deptService;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {

		System.out.println("Emp ID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Dept ID: " + deptService.getDeptId());
		System.out.println("Dept Name: " + deptService.getDeptName());
		System.out.println("--------------------------------------------");

	}

}
