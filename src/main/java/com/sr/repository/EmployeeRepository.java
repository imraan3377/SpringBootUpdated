package com.sr.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.model.Employee;


@Repository
@Transactional

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	


}
