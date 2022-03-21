package com.nit.sandesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.sandesh.model.Employee;
import com.nit.sandesh.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service; // HAS-A

	/**
	 * 
	 * @return
	 */
	/*
	 * if end-user enters /register in addressBar 
	 * this method is called and loads 
	 * EmployeeRegister.html page from /template folder
	 */
	@GetMapping("/register")
	public String show() {
		return "EmployeeRegister";
	}

	/**
	 * On Form Submit (/save+POST), Read data as Object using @ModelAttribute
	 * Call service layer with object, read ID back
	 * Create message as String
	 * use Model memory, send message to UI
	 * Return back to EmployeeRegister.html
	 */
	@PostMapping("/save")
	public String saveEmployee(
			@ModelAttribute Employee employee,
			Model model) 
	{
		Integer id = service.saveEmployee(employee);
		String message = "Employee '"+id+"' Created";
		model.addAttribute("message", message);
		return "EmployeeRegister";
	}
	
	@GetMapping("/all")
	public String viewAllEmployees(Model model) {
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("list", list);
		return "EmployeesData";
	}
}
