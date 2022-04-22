package com.sr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.model.Employee;
import com.sr.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeDao{
	
	@Autowired
	public EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee=empRepo.findAll();
		if (employee!=null && employee.size()>0) {
			return employee;
		}
			return null;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		if (emp!=null) {
			return empRepo.saveAndFlush(emp);
			
		}
		return null;
	}
	
	
	
	
	
	
	
	
	

}
