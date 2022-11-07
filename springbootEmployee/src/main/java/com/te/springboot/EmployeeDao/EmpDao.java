package com.te.springboot.EmployeeDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.EmployeeEntity.Employee;

@Repository
public interface EmpDao extends JpaRepository<Employee,String>{

	Employee findByEmpId(String empId);
	

}
