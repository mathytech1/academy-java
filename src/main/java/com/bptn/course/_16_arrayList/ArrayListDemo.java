package com.bptn.course._16_arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void  main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		System.out.println(myList.get(0));
		myList.add("Milk");
		myList.add("Bread");
		myList.add("Eggs");
		
		System.out.println("Grocery List: "+myList);
		//System.out.println()
	}
}
