package com.bptn.course.week5.monday_big_coding;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search
	// for
	public static int binarySearch(int[] arr, int key) {
		// First, we need to sort the array because binary search only works on sorted
		// arrays
		Arrays.sort(arr);

		// Initialize pointers for the start (low) and end (high) of the array
		int low = 0;
		int high = arr.length - 1;

		// Loop as long as the low pointer is less than or equal to the high pointer
		// This ensures we still have elements to search within
		while (low <= high) {
			// Calculate the middle index by dividing the sum of low and high by 2
			int mid = (low + high) / 2;

			// If the key is found at the middle index, return its position
			if (arr[mid] == key) {
				return mid;
			}
			// If the key is greater than the middle element, search in the right half
			else if (arr[mid] < key) {
				low = mid + 1;
			}
			// If the key is smaller than the middle element, search in the left half
			else {
				high = mid - 1;
			}
		}

		// If we exit the loop, it means the key was not found in the array
		return -1; // Return -1 to indicate that the key was not found
	}

	// Do not modify the code below
	public static void main(String[] args) {

		// Create an array of unsorted integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Define the key we are searching for in the array
		int key = 22;

		// Perform the binary search to find the key
		int result = binarySearch(arr, key);

		// Print the result of the search
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}

/*
 * Summary: In this exercise, I implemented binary search, which is an efficient
 * way to search for an element in a sorted array. One thing I had to keep in
 * mind was that the array needed to be sorted before performing the binary
 * search, since the algorithm relies on comparing the middle element with the
 * key.
 * 
 * The task was straightforward because binary search logic is simple: it
 * repeatedly divides the search space in half. However, I had to remember to
 * handle the edge case where the key is not found, returning -1 in that case.
 * 
 * Something I will take from this lesson is the importance of sorting the array
 * before binary search, and understanding how the logic of narrowing down the
 * search range works. This will be useful for future tasks involving search
 * algorithms.
 */
