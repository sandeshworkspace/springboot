package com.nit.sandesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.sandesh.model.Employee;
import com.nit.sandesh.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo; 		//HAS- A

	@Override
	public Integer saveEmployee(Employee employee) {
		employee = repo.save(employee);
		return employee.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}

}
