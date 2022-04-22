package com.sr.service;

import java.util.List;

import com.sr.model.Employee;

public interface EmployeeDao {
	
	
	public List<Employee> getAllEmployee();
public Employee addEmployee(Employee emp);
}
