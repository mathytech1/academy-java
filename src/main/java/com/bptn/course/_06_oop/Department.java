package com.bptn.course._06_oop;

class Department {
	private String departmentName;
	private int numberOfEmployees;
	
	public Department(String departmentName, int numberOfEmployees) {
		this.departmentName = departmentName;
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public void departmentInfo() {
		System.out.println("Department Name: " + departmentName);
		System.out.println("Number of employees: " + numberOfEmployees);
	}
	

	public String getDepartmentName() {
		return departmentName;
	}


	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	
	
}
