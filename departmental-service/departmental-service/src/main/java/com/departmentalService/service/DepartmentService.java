package com.departmentalService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentalService.entity.Department;
import com.departmentalService.repositories.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public void addDepartment(Department department)
	{
		departmentRepository.save(department);
	}
    
	public List<Department> findAllDepartments()
	{
		List<Department> departments = new ArrayList<Department>();
		 departmentRepository.findAll().forEach(departments::add);
		return departments;
	}
	
	public Optional<Department> findDepartmentById(Long departmentId)
	{
		return departmentRepository.findById(departmentId);
		
	}
	
	public void updateDepartments(Department department, Long departmentId)
	{
		departmentRepository.save(department);
	}
	
	public void deleteDepartments(Long departmentId)
	{
		departmentRepository.deleteById(departmentId);
	}
	
	public String findByDepartmentName(String departmentCode)
	{
		return departmentRepository.findByDepartmentName(departmentCode);
	}
}
