package com.bptn.course._05_strings;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Scanner class object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome");
        // Read and store user input
        String input = scanner.nextLine();
        // Initialize a new string, which will store the reverse of the original
        // string and initialize it to empty string
        String reverseInput = "";

        //Create a for loop which run from the input string size - 1 to 0
        for(int i = input.length()-1; i>=0; i--){
            // read the last character of input string and concatenate it to reverseInput string
            reverseInput += input.charAt(i);
        }

        // Compare if the two strings are equal by ignoring the case
        if(input.equalsIgnoreCase(reverseInput)){
            // Condition is true. print 'Input string is palindrome'
            System.out.println("Input string is palindrome");
        }else{
            // Condition is false. print 'Input string is not palindrome'
            System.out.println("Input string is not palindrome");
        }
	}
}
