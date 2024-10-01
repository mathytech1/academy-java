package com.bptn.course._06_oop;

class BankAccount {
	// Data Members / Properties
	private String accountNumber;
	private double balance;
	
	// Constructor
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Instance Method, Class Method, Behavior
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void displayAccountInfo() {
		System.out.println("account Number: "+accountNumber);
		System.out.println("Current Balance: "+balance);
	}

}
