package com.te.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springboot.Entity.Employee;
import com.te.springboot.dto.RegisterDto;

public interface EmpDao  extends JpaRepository<Employee, String>{
	public Employee findByEmpId(String empId);
}
