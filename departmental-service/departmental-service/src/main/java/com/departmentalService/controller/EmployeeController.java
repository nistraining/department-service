package com.departmentalService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.departmentalService.entity.Employee;
import com.departmentalService.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/employees")
	//@PreAuthorize("hasAuthority('employee:write')")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping("/employees")
	//@PreAuthorize("hasAnyRole('ROLE_EMPLOYEE','ROLE_STOREMANAGER')")
	public List<Employee> getAllEmployees()
	{
		return employeeService.findAllEmployees();
	}
	
	@RequestMapping("/employees/{empId}")
	//@PreAuthorize("hasAnyRole('ROLE_EMPLOYEE','ROLE_STOREMANAGER')")
	public Optional<Employee> findEmployeeById(@PathVariable Integer empId)
	{
		return employeeService.findEmployeeById(empId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value =  "/employees/{empId}")
	//@PreAuthorize("hasAuthority('employee:write')")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable Integer empId)
	{
		employeeService.updateEmployees(employee, empId);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/employees/{empId}")
	//@PreAuthorize("hasAuthority('employee:write')")
	public void deleteDepartment(@PathVariable Integer empId)
	{
		employeeService.deleteEmployees(empId);
	}

}
