package com.departmentalService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentalService.entity.Employee;
import com.departmentalService.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	public List<Employee> findAllEmployees()
	{
		List<Employee> emplist = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(emplist::add);
		return emplist;
	}
	
	public Optional<Employee> findEmployeeById(Integer empId)
	{
		return employeeRepository.findById(empId);
	}
	
	public void updateEmployees(Employee employee, Integer empId)
	{
		employeeRepository.save(employee);
	}
	
	public void deleteEmployees(Integer empId)
	{
		employeeRepository.deleteById(empId);
	}

}
