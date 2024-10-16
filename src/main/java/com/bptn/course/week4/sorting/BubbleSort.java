package com.bptn.course.week4.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = { 5, 3, 1, 2, 0, 4, 8, 10, 7, 8, 11, 3 };
		System.out.println("Unsorted Array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		int[] sortedNum = buubleSort(num);
		System.out.println("Sorted Array:");
		for (int i = 0; i < sortedNum.length; i++) {
			System.out.print(sortedNum[i] + " ");
		}
	}

	private static int[] buubleSort(int[] num) {
		int n = num.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
}
