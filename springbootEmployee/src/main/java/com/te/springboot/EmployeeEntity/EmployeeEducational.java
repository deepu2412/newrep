package com.te.springboot.EmployeeEntity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="EmployeeEducationalInfo")
public class EmployeeEducational implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int educId;
	private String qualification;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Employee employeePrimaryInfo;
	
	public int getEducId() {
		return educId;
	}
	public void setEducId(int educId) {
		this.educId = educId;
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Employee getEmployeePrimaryInfo() {
		return employeePrimaryInfo;
	}
	public void setEmployeePrimaryInfo(Employee employeePrimaryInfo) {
		this.employeePrimaryInfo = employeePrimaryInfo;
	}
	
   
}
