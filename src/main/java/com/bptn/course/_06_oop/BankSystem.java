package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {
		/*BankAccount myAccount = new BankAccount("10001", 100000.0);
		myAccount.displayAccountInfo();
		
		BankAccount myAccount2 = new BankAccount("10002", 50000.0);
		myAccount2.displayAccountInfo();*/
		
		/*
		 * SavingAccount myAccount = new SavingAccount("SAVINGS123", 500.00, 1.00);
		 * myAccount.displayAccountInfo(); myAccount.applyInterest();
		 * myAccount.displayAccountInfo();
		 */
		
		CheckingAccount myAccount = new CheckingAccount("CHECKING123", 500, 200);
		myAccount.withdraw(600);
		myAccount.displayAccountInfo();
	}

}
