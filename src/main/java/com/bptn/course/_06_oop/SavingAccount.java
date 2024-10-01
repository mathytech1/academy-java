package com.bptn.course._06_oop;

class SavingAccount extends BankAccount{
	private double interestRate;
	
	public SavingAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate ;
	}
	
	public void applyInterest() {
		double interest = getBalance() * interestRate/100;
		deposit(interest);
	}
}
