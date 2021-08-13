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

import com.departmentalService.entity.Department;
import com.departmentalService.service.DepartmentService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/departments")
	//@PreAuthorize("hasAuthority('storemanager:write')")
	public void addDepartment(@RequestBody Department department)
	{
		log.info("Adding a department", department.getDepartmentId());
		departmentService.addDepartment(department);
	}
	
	@RequestMapping("/departments/findAll")
	//@PreAuthorize("hasAnyRole('ROLE_STOREMANAGER','ROLE_EMPLOYEE')")
	public List<Department> findDepartments()
	{
		log.info("Getting all the departments");
		return departmentService.findAllDepartments();
	}
	
	
	@RequestMapping("/departments/{departmentId}")
	//@PreAuthorize("hasAnyRole('ROLE_STOREMANAGER','ROLE_EMPLOYEE')")
	public Optional<Department> findDepartmentId(@PathVariable Long departmentId)
	{
		log.info("FInding dpeartment by Id", departmentId);
		return departmentService.findDepartmentById(departmentId);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value =  "/departments/{departmentId}")
	//@PreAuthorize("hasAuthority('storemanager:write')")
	public void updateDepartment(@RequestBody Department department, @PathVariable Long departmentId)
	{
		departmentService.updateDepartments(department, departmentId);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/departments/{departmentId}")
	//@PreAuthorize("hasAuthority('storemanager:write')")
	public void deleteDepartment(@PathVariable Long departmentId)
	{
		departmentService.deleteDepartments(departmentId);
	}
	
	/*
	 * @RequestMapping("/departments/{departmentCode}") public String
	 * findByDepartmentName(@PathVariable String departmentCode) { return
	 * departmentService.findByDepartmentName(departmentCode); }
	 */
	
}
