package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int number = scanner.nextInt();
		 System.out.println("You have entered: " + number);
	}
}
