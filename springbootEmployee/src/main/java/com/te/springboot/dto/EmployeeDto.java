package com.te.springboot.dto;

import java.util.List;

import com.te.springboot.EmployeeEntity.EmployeeEducational;
import com.te.springboot.EmployeeEntity.EmployeeSecondary;

import lombok.Data;
@Data

public class EmployeeDto {
	private String empId;
	private String empName;
	private String empAge;
	
    private List<EmployeeEducational> educationInfo;
	
	private EmployeeSecondary employeeSecondaryInfo;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public List<EmployeeEducational> getEducationInfo() {
		return educationInfo;
	}

	public void setEducationInfo(List<EmployeeEducational> educationInfo) {
		this.educationInfo = educationInfo;
	}

	public EmployeeSecondary getEmployeeSecondaryInfo() {
		return employeeSecondaryInfo;
	}

	public void setEmployeeSecondaryInfo(EmployeeSecondary employeeSecondaryInfo) {
		this.employeeSecondaryInfo = employeeSecondaryInfo;
	}
	 
	


}
