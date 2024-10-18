package com.bptn.course.week4;

import java.util.ArrayList;

public class TestClass {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Mathew");
		names.add("Karren");
		names.add("John");
		System.out.println(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("For each loop");
		for (String n : names)
			System.out.println(n);
		names.remove(1);
	}

}
