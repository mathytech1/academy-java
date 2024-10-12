package com.bptn.course.leetcode;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class LeetCode1 {
	public static void main(String[] args) {
		// Create a TreeSet object
		TreeSet<Integer> set = new TreeSet<>();

		// Add elements to set
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		// Print initial set elements
		System.out.println("Initial Set Elements: " + set);

		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println("TreeSet Elements in decending order: " + descendingSet);

		Iterator<Integer> iterator = set.iterator();

		// Printing Set elements using Iterator
		System.out.print("Printing Set with an Iterator: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		System.out.println();

		// Deleting an element from TreeSet
		set.remove(20);
		System.out.println("TreeSet after deleting an Elements: " + set);
	}
}
