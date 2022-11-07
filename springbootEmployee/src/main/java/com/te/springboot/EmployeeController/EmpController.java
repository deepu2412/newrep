package com.te.springboot.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.EmployeeServices.EmployeeService;
import com.te.springboot.dto.EmployeeDto;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmpController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody EmployeeDto empDto) {

		try {
			service.register(empDto);
			return new ResponseEntity<String>("Registration Successful", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Something went wrong", HttpStatus.BAD_REQUEST);
		}

	}
}
