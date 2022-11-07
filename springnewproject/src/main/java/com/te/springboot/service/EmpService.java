package com.te.springboot.service;

import com.te.springboot.Entity.Employee;
import com.te.springboot.dto.EmpLoginDto;
import com.te.springboot.dto.RegisterDto;

public interface EmpService {
	public RegisterDto register(RegisterDto dto);
	public RegisterDto getLogin(EmpLoginDto dto);
}