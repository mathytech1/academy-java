package com.bptn.course.week4.generics;

import java.util.ArrayList;

public class GenericPractice {

	public static void main(String[] args) {
		ArrayList<Number> num = new ArrayList<>();
		num.add(5.5);
		num.add(6.6);
		num.add(1.7);
		num.add(9);
		num.add(4);

		sum(num);

	}

	private static <T extends Number> void sum(ArrayList<T> nums) {
		double sum = 0.0;
		for (T num : nums) {
			sum += num.doubleValue();
		}
		System.out.println("The sum is: " + sum);
	}

}
