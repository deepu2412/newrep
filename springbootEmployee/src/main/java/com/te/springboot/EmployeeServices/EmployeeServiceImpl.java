package com.te.springboot.EmployeeServices;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.EmployeeDao.EmpDao;
import com.te.springboot.EmployeeEntity.Employee;
import com.te.springboot.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmpDao dao;
	
	private ModelMapper mapper;
	/*
	 * @Override public Employee register(Employee employee) {
	 * 
	 * return dao.save(employee); }
	 */
	@Override
	public void register(EmployeeDto empDto) {
		Employee request=mapper.map(empDto,Employee.class);
		dao.save(request);
	}
	

//	@Override
//	public Employee getEmployee(String empId) {
//		return dao.findByEmpId(empId);
//	}
}
