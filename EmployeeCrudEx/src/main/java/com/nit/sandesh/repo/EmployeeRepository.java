package com.nit.sandesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.sandesh.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
