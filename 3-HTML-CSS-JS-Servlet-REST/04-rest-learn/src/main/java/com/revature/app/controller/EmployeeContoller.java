package com.revature.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.revature.app.model.Department;
import com.revature.app.model.Employee;

@Path("/employees")
public class EmployeeContoller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> list() {
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("John");
		employee1.setGender("M");
		employee1.setSalary(5000);
		Department department = new Department();
		department.setId(1);
		department.setName("Manufacturing");
		employee1.setDepartment(department);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Stella");
		employee2.setGender("F");
		employee2.setSalary(5000);
		employee2.setDepartment(department);

		employeeList.add(employee1);
		employeeList.add(employee2);

		return employeeList;

	}
}
