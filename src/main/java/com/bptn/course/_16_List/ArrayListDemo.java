package com.bptn.course._16_List;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void  main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		//System.out.println(myList.get(0));
		myList.add("Milk");
		myList.add("Bread");
		myList.add("Eggs");
		
		System.out.println("Grocery List: "+myList);
		//System.out.println()
		
		ArrayList list = new ArrayList();
		list.add(1);
		System.out.println(list);
	}
}
