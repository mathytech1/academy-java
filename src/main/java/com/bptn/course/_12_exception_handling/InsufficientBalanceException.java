package com.bptn.course._12_exception_handling;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}