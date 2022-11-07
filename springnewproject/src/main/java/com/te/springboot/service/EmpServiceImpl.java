package com.te.springboot.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.te.springboot.Entity.Employee;
import com.te.springboot.dao.EmpDao;
import com.te.springboot.dto.EmpLoginDto;
import com.te.springboot.dto.RegisterDto;

public class EmpServiceImpl implements EmpService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private EmpDao dao;

	@Override
	public RegisterDto register(RegisterDto dto) {
		Employee employee = this.mapper.map(dto, Employee.class);
		dao.save(employee);
		return this.mapper.map(employee, RegisterDto.class);
	}

	@Override
	public RegisterDto getLogin(EmpLoginDto dto) {

		Employee employee = dao.findByEmpId(dto.getEmpId());
		if (employee.getPassword().equals(dto.getEmpId())) {
			return this.mapper.map(employee, RegisterDto.class);

		}
		return null;
	}

}
