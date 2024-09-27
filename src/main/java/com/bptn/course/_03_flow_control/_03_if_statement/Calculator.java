package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store numbers, the user's operation choice, and a loop control variable
        double firstNumber, secondNumber;
        int choice, loop = 1;  // loop = 1 means the user will be prompted to perform operations

        do {
            // Display a blank line for spacing
            System.out.println();

            // Print the menu options for the calculator
            System.out.println("Welcome to Our Calculator App!!!");
            System.out.println("Please enter the operation to be performed:");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");

            // Get the user's choice of operation
            choice = scanner.nextInt();
            System.out.println();  // Print a blank line for better readability

            // Perform the corresponding operation based on the user's choice
            if (choice == 1) {  // Addition
                System.out.print("Enter the first number: ");
                firstNumber = scanner.nextInt();  // Get the first number
                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();  // Get the second number
                double sum = firstNumber + secondNumber;  // Perform addition
                System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is = " + sum);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                loop = scanner.nextInt();  // Ask user if they want to continue
            } else if (choice == 2) {  // Subtraction
                System.out.print("Enter the first number: ");
                firstNumber = scanner.nextInt();
                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();
                double sub = firstNumber - secondNumber;  // Perform subtraction
                System.out.println("The subtraction of " + firstNumber + " and " + secondNumber + " is = " + sub);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                loop = scanner.nextInt();
            } else if (choice == 3) {  // Multiplication
                System.out.print("Enter the first number: ");
                firstNumber = scanner.nextInt();
                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();
                double mult = firstNumber * secondNumber;  // Perform multiplication
                System.out.println("The product of the numbers " + firstNumber + " and " + secondNumber + " is = " + mult);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                loop = scanner.nextInt();
            } else if (choice == 4) {  // Division
                System.out.print("Enter the first number: ");
                firstNumber = scanner.nextInt();
                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();
                double quotient = firstNumber / secondNumber;  // Perform division
                double remainder = firstNumber % secondNumber;  // Calculate remainder
                System.out.println("Dividing " + firstNumber + " by " + secondNumber + ", the quotient is " + quotient);
                System.out.println("The remainder is " + remainder);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                loop = scanner.nextInt();
            } else if (choice == 5) {  // Square of a number
                System.out.print("Enter the number to be squared: ");
                firstNumber = scanner.nextInt();
                double sqr = firstNumber * firstNumber;  // Calculate the square
                System.out.println("The Square of the number " + firstNumber + " is = " + sqr);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                loop = scanner.nextInt();
            } else if (choice == 6) {  // Square root of a number
                System.out.print("Enter the number to find the square root: ");
                firstNumber = scanner.nextInt();
                double sqrts = Math.sqrt(firstNumber);  // Calculate the square root
                System.out.println("Square root of " + firstNumber + " is: " + sqrts);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                loop = scanner.nextInt();
            } else if (choice == 7) {  // Reciprocal of a number
                System.out.print("Enter the number: ");
                firstNumber = scanner.nextInt();
                double resp = 1 / firstNumber;  // Calculate the reciprocal
                System.out.println("The Reciprocal of the number " + firstNumber + " is = " + resp);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                loop = scanner.nextInt();
            } else {  // Invalid input
                System.out.println("Invalid choice! Please make a valid choice.");
            }

        } while (loop == 1);  // Repeat the loop if the user wants to continue
        System.out.println("Thank you for using our calculator app!!!");
    }
}
