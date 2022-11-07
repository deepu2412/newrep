package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.Entity.Employee;
import com.te.springboot.dto.EmpLoginDto;
import com.te.springboot.dto.RegisterDto;
import com.te.springboot.service.EmpService;


@RestController
public class EmpController {
	@Autowired
	private EmpService service;
	

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody RegisterDto dto){

		if (service.register(dto) != null) {
			return new ResponseEntity<String>("Registered successfully", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("Something went wrong", HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/login")
	public ResponseEntity<?> getLogin(@RequestBody EmpLoginDto dto) {
		RegisterDto login = service.getLogin(dto);

		if (login != null) {
		
			return new ResponseEntity<>("Welcome " + login.getEmpName(), HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("Something went wrong", HttpStatus.ACCEPTED);

	}


}
