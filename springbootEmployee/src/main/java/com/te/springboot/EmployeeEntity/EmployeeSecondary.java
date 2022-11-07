package com.te.springboot.EmployeeEntity;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="EmployeeSecondaryInfo")
public class EmployeeSecondary implements Serializable{
	
	@Id
	private String pan;
	private String height;
	@OneToOne(cascade=CascadeType.ALL)
	private Employee employeePrimaryInfo;
	
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public Employee getEmployeePrimaryInfo() {
		return employeePrimaryInfo;
	}
	public void setEmployeePrimaryInfo(Employee employeePrimaryInfo) {
		this.employeePrimaryInfo = employeePrimaryInfo;
	}

 
}
