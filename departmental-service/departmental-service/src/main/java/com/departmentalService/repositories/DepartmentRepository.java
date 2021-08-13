package com.departmentalService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departmentalService.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	public List<Department> findByDepartmentCode(String departmentCode);
	
	public String findByDepartmentName(String departmentCode);

}
