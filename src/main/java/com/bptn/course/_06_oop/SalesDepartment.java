package com.bptn.course._06_oop;

 class SalesDepartment extends Department{
	 private double totalPurchaseAmount;
	 
	 public SalesDepartment(String departmentName, int numberOfEmployees, double totalPurchaseAmount) {
		super(departmentName, numberOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}
	 
	 @Override
	 public void departmentInfo() {
			super.departmentInfo();
			System.out.println("Total Purchase: " + totalPurchaseAmount);
		}
}
