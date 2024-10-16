package com.bptn.course.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DeleteDuplicates {
	/*
	 * This method deletes duplicates from an unsorted ArrayList.
	 * 
	 * @param nums the sorted ArrayList with duplicates
	 * 
	 * @return a sorted ArrayList without duplicates
	 */
	public static List<Integer> deleteDuplicates(List<Integer> nums) {
		// Check if the list is null or empty, and return an empty list if so
		if (nums == null || nums.size() == 0) {
			// ...
			return nums;
		}

		// Implement the bigger details of your algorithm here...
		// Convert the list into TreeSet. TreeSet will store the unique and sorted
		// elements.
		// TreeSet has the time complexity of O(n*log n) to do the operation on it and
		// return unique and sorted elements.
		TreeSet<Integer> sortedAndUnique = new TreeSet<>(nums);

		// Convert the TreeSet back to the List and return.
		nums = new ArrayList<>(sortedAndUnique);
		// return sortedAndUnique arraylist
		return nums;
	}

	public static void main(String[] args) {
		// Initialize a sample sorted ArrayList with duplicate values
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(5);

		// Call the deleteDuplicates method with the sample list as argument
		List<Integer> result = deleteDuplicates(nums);

		// Print the result to the console
		System.out.println(result);
	}
}
