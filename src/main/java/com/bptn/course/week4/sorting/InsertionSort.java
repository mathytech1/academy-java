package com.bptn.course.week4.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] num = { 1, 2, 8, 4, 5, 6, 0, 7, 6, 10, 8 };
		System.out.println("Unsorted Array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		int[] sortedNum = insertionSort(num);
		System.out.println("Sorted Array:");
		for (int i = 0; i < sortedNum.length; i++) {
			System.out.print(sortedNum[i] + " ");
		}
	}

	private static int[] insertionSort(int[] num) {
		for (int i = 1; i < num.length; i++) {
			int j = i;
			while (j > 0 && num[j - 1] > num[j]) {
				int temp = num[j - 1];
				num[j - 1] = num[j];
				num[j] = temp;
				j--;
			}
		}
		return num;
	}

//	public static void insertionSort(int[] elements) {
//	  for (int j = 1; j < elements.length - 1; j++) {                      // line 1
//	     int temp = elements[j];                                           // line 2
//	     int possibleIndex = j;                                            // line 3
//	     while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) { // line 4
//	        elements[possibleIndex] = elements[possibleIndex - 1];         // line 5
//	        possibleIndex--;
//	     }
//	     elements[possibleIndex] = temp;
//	  }
//	}

//	static void insertionSort(int[] array) {
//	  int size = array.length;
//	  // outer loop for each index
//	  for (int i = 1; i < size; i++) {
//	   int key = array[i];
//	   int j = i - 1;
//	   // inner loop to compare and swap
//	   while (j >= 0 && array[j] > key) {
//	    array[j + 1] = array[j];
//	    j = j - 1;
//	   }
//	   array[j + 1] = key;
//	  }
//	 }

}
