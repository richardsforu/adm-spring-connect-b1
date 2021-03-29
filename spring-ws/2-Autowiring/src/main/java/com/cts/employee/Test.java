package com.cts.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.employee.service.DepartmentServiceImpl;
import com.cts.employee.service.EmployeeServiceImpl;
import com.cts.product.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeServiceImpl emp = ac.getBean(EmployeeServiceImpl.class);
		DepartmentServiceImpl dept = ac.getBean(DepartmentServiceImpl.class);

		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(2837434);

		dept.setDeptId(1000);
		dept.setDeptName("HR");

		//emp.setDeptService(dept); // DI

		emp.display();

	}

}
