package com.departmentalService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_department",
      uniqueConstraints = @UniqueConstraint(
    		  name="departmentcode_unique",
    		  columnNames = "department_code"
    		  )
      
      
		)
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="department_id")
	private Long departmentId;
	@Column(name="department_name")
	private String departmentName;
	@Column(name="department_code", nullable = false)
	private String departmentCode;
	@Column(name="department_email")
	private String departmentemail;
	@Column(name="department_address")
	private String departmentAddress;
}
