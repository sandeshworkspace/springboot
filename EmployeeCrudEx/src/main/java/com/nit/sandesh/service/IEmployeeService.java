package com.nit.sandesh.service;

import java.util.List;

import com.nit.sandesh.model.Employee;

public interface IEmployeeService {
	public Integer saveEmployee(Employee employee);
	public List<Employee> getAllEmployees();
}
