package com.te.springboot.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Table(name="primary_info")

public class Employee {
	@Id
	private String empId;
	private String empName;
	private String empAge;
	private String password;
	
	

}
