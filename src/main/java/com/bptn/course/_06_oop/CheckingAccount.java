package com.bptn.course._06_oop;

class CheckingAccount extends BankAccount{
	private double overDraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overDraftLimit) {
		super(accountNumber, balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=(getBalance() + overDraftLimit)) {
			super.withdraw(amount);
		}
	}
	
}
