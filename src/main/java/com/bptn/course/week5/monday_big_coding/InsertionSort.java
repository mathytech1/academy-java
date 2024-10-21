package com.bptn.course.week5.monday_big_coding;

public class InsertionSort {
	// This method sorts an array in ascending order using the insertion sort
	// algorithm
	public static void insertionSort(int[] arr) {

		// First, check if the array is empty (no elements to sort)
		if (arr.length == 0) {
			// If the array is empty, just return since there's nothing to do
			return;
		}

		// Starting from the second element (index 1), we need to place each element
		// in its correct position relative to the elements before it.
		for (int i = 1; i < arr.length; i++) {
			// The 'current' variable holds the element we're trying to insert.
			int current = arr[i];
			// We'll compare 'current' with elements to the left, starting from index (i -
			// 1).
			int j = i - 1;

			// This loop shifts elements that are greater than 'current' to the right.
			while (j >= 0 && arr[j] > current) {
				// Move arr[j] one position to the right to make space for 'current'
				arr[j + 1] = arr[j];
				// Move left to check the next element
				j--;
			}

			// Once we find the right position, insert 'current'
			arr[j + 1] = current;
		}
	}

	// Main method to test the sorting algorithm
	public static void main(String[] args) {
		// Initialize an array of integers to be sorted
		int[] arr = { 3, 4, 1, -2, 4, 8 };

		// Call the sorting method
		insertionSort(arr);

		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
 * Summary: In this exercise, I implemented the insertion sort algorithm. The
 * main challenge was ensuring that each element finds its correct place by
 * comparing it to the elements that come before it in the array. Initially, I
 * made a mistake in the comparison, where I wasn't comparing the right
 * elements, but after fixing that, the algorithm worked correctly.
 * 
 * What I found interesting about this task was how easy it is to make a small
 * mistake in a sorting algorithm, especially when handling the inner loop that
 * shifts elements around. I also learned the importance of handling edge cases
 * like an empty array to avoid any unexpected behavior. In future tasks, I'll
 * pay more attention to the details of these logical comparisons and make sure
 * I thoroughly test for different cases.
 */
