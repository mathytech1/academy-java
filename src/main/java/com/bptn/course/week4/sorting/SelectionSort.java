package com.bptn.course.week4.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = { 5, 7, 8, 1, 2, 3, 4, 6, 10, 12, 3 };
		System.out.println("UnSorted array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		int[] sortedNum = selectionSort(num);
		System.out.println("Sorted array:");
		for (int i = 0; i < sortedNum.length; i++) {
			System.out.print(sortedNum[i] + " ");
		}
	}

	private static int[] selectionSort(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[index]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = num[index];
				num[index] = num[i];
				num[i] = temp;
			}

		}

		return num;
	}

}
