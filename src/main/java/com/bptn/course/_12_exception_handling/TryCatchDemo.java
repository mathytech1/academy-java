package com.bptn.course._12_exception_handling;

import java.util.Scanner;

public class TryCatchDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter the first number: ");
		double num2 = scanner.nextDouble();
		
		try{
			double div = num1 / num2;
			System.out.println(num1 + " / " + num2 +" = " + div);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
