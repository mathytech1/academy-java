package com.bptn.course._09_inheritance;

public class MathUtil {
	// static dataType propertyName;
	static double valueOfPi = 3.14;
	static int counter;

	// static returnType methodName;
	static int add(int a, int b) {
		counter++;
		return a + b;

	}

	public void displayData() {
		System.out.print("This is not static");
		System.out.print("Number of Visits: " + MathUtil.counter);
	}

	public static void main(String[] args) {

	}
}