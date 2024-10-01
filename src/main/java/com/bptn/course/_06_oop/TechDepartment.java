package com.bptn.course._06_oop;

class TechDepartment extends Department{
	private double totalPurchase;

	public TechDepartment(String departmentName, int numberOfEmployees, double totalPurchase) {
		super(departmentName, numberOfEmployees);
		this.totalPurchase = totalPurchase;
	}	
}

