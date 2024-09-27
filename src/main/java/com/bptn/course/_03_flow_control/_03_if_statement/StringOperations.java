package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to take user input

        int choice, loop = 1;  // Initialize variables for user choice and looping condition

        do {
            // Display menu options for the user
            System.out.println("...String Menu...");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            System.out.print("Enter the option: ");
            choice = scanner.nextInt();  // Get user's choice
            String fristString = "", secondString = "";  // Initialize strings

            // Option 1: Check if the string is a palindrome
            if (choice==1){
                System.out.println("Palindrome Check");
                System.out.println("Enter a string: ");
                fristString = scanner.next();  // Read the input string
                secondString = fristString.toLowerCase();  // Convert to lowercase for case-insensitive comparison
                boolean isPalindrome = true;  // Boolean flag to track if string is a palindrome
                int counter = 0;  // Counter to iterate through the string

                // Loop to check if the string is a palindrome
                for(int i = secondString.length() - 1; i >= 0; i--){
                    if(secondString.charAt(counter) != (secondString.charAt(i))){  // Compare characters from both ends
                        isPalindrome = false;  // Set flag to false if mismatch found
                        break;
                    }
                    counter++;
                }

                // Print result based on palindrome check
                if(isPalindrome){
                    System.out.println(fristString + "  is a palindrome");
                }else{
                    System.out.println(fristString + " is not a palindrome");
                }

                // Ask user if they want to continue or exit
                System.out.println("Press 1 to continue and any number to exit.");
                loop = scanner.nextInt();
            }
            // Option 2: Reverse the input string
            else if (choice==2) {
                System.out.println("Reverse a string");
                System.out.println("Enter a string: ");
                fristString = scanner.next();  // Read the input string

                // Loop to reverse the string
                for(int i=fristString.length()-1; i>=0;i--){
                    secondString += fristString.charAt(i);  // Append characters in reverse order
                }

                // Print the reversed string
                System.out.println("The reverse of the entered string is: "+secondString);
                System.out.println("Press 1 to continue and any number to exit.");
                loop = scanner.nextInt();
            }
            // Option 3: Concatenate two strings
            else if (choice==3) {
                System.out.println("Enter the first string:");
                fristString = scanner.next();  // Read the first string
                System.out.println("Enter second string:");
                secondString = scanner.next();  // Read the second string

                // Print the concatenated result
                System.out.println(fristString + secondString);
                System.out.println("Press 1 to continue and any number to exit.");
                loop = scanner.nextInt();
            }
            // Option 4: Compare two strings for equality
            else if (choice==4) {
                System.out.println("String Comparison\n");
                System.out.println("Enter the first string:");
                fristString = scanner.next();  // Read the first string
                System.out.println("Enter second string:");
                secondString = scanner.next();  // Read the second string

                // Compare strings (case-insensitive) and print the result
                if((fristString.toLowerCase().compareTo(secondString.toLowerCase())) == 0){
                    System.out.println("The entered strings are equal");
                }else{
                    System.out.println("The entered strings are not equal");
                }
                System.out.println("Press 1 to continue and any number to exit.");
                loop = scanner.nextInt();
            }
            // Option 5: Calculate the length of the string
            else if (choice==5) {
                System.out.println("Length of a string");
                System.out.println("Enter a string: ");
                fristString = scanner.next();  // Read the input string

                // Print the length of the string
                System.out.println("The length of the entered string is: "+fristString.length());
                System.out.println("Press 1 to continue and any number to exit.");
                loop = scanner.nextInt();
            }
            // Invalid choice: Ask the user to enter a valid option
            else{
                System.out.println("Please enter the rigth choice!!");
            }

        }while(loop == 1);  // Continue the loop if the user enters '1'
        System.out.println("Thank you!!!");  // Print a thank you message when exiting
    }
}
