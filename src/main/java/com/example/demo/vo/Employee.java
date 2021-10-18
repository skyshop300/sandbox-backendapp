package com.example.demo.vo;

import lombok.Data;

@Data
public class Employee {
	private String employeeId;
	private String employeeName;
	
	public Employee(String employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	
}
