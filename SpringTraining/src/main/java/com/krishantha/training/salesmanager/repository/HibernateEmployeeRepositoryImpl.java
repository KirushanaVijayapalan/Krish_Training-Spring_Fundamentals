package com.krishantha.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository, com.krishantha.training.salesmanager.service.EmployeeService{
	List<Employee> employees=new ArrayList<>(); 
    Employee employee=new Employee(); 

    @Override
    public List<Employee> getAllEmployees(){

        employee.setEmployeeName("kishara");
        employee.setEmployeeLocation("kilionochchi"); 

        employees.add(employee); 
        return employees; 
}
}
