package com.krishantha.training.salesmanager.model;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.krishantha.training.salesmanager.repository.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;

@SpringBootApplication
public class SpringTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTrainingApplication.class, args);
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());

		}
	}

}
