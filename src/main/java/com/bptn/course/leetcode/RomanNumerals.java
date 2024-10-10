package com.bptn.course.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		System.out.print("Enter the rooman numeral: ");
		String rnumeral = scanner.nextLine();
		int number = 0;
		boolean isNumeral = true;

		if (rnumeral.length() == 1) {
			if (map.containsKey(rnumeral.charAt(0))) {
				System.out.println(map.get(rnumeral.charAt(0)));
			}
			isNumeral = false;
		} else {
			for (int i = 0; i < rnumeral.length(); i++) {
				if (map.containsKey(rnumeral.charAt(i))) {
					if (i < rnumeral.length() - 1) {
						number += map.get(rnumeral.charAt(i));
					} else {
						if (rnumeral.charAt(i) <= rnumeral.charAt(i - 1)) {
							number += map.get(rnumeral.charAt(i));
						} else {
							number = map.get(rnumeral.charAt(i)) - number;
						}
					}
				} else {
					isNumeral = false;
					break;
				}
			}
		}

		if (isNumeral) {
			System.out.println(number);
		} else {
			System.out.println("'" + rnumeral + "' is not entirelly Roman Numeral");
		}
	}

}
