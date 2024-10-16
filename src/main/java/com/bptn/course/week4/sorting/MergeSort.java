package com.bptn.course.week4.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] num = { 5, 3, 1, 7, 5, 6, 9, 1, 0, 10, 3, 12, 4 };
		System.out.println("Unsorted array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		int high = num.length - 1;
		int[] sortedNum = mergeSort(num, 0, high);
		System.out.println("Sorted array:");
		for (int i = 0; i < sortedNum.length; i++) {
			System.out.print(sortedNum[i] + " ");
		}

	}

	private static int[] mergeSort(int[] num, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(num, left, middle);
			mergeSort(num, middle + 1, right);

			merge(num, left, middle, right);
		}

		return num;
	}

	private static void merge(int[] num, int left, int middle, int right) {
		int size1 = middle - left + 1;
		int size2 = right - middle;

		int[] arrayOne = new int[size1];
		int[] arrayTwo = new int[size2];

		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = num[left + i];
		}
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = num[middle + 1 + i];
		}
		int i = 0, j = 0;
		int pointer = left;
		while (i < size1 && j < size2) {
			if (arrayOne[i] <= arrayTwo[j]) {
				num[pointer] = arrayOne[i];
				i++;
			} else {
				num[pointer] = arrayTwo[j];
				j++;
			}
			pointer++;
		}

		while (i < size1) {
			num[pointer] = arrayOne[i];
			i++;
			pointer++;
		}
		while (j < size2) {
			num[pointer] = arrayTwo[j];
			j++;
			pointer++;
		}

	}

}
