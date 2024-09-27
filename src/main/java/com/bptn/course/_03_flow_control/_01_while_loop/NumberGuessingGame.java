package com.bptn.course._03_flow_control._01_while_loop;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to capture user input
        int targetNumber = 23;  // The target number the user needs to guess
        int guess;  // Variable to store the user's guess

        System.out.print("Enter a number between 1 and 100 inclusive: ");  // Prompt the user to enter a number

        // Infinite loop to keep prompting the user until they guess the correct number
        while(true){
            guess = scanner.nextInt();  // Capture the user's guess

            // Check if the guessed number is higher than the target number
            if(guess > targetNumber){
                System.out.println("Too high! Try again.");  // Inform the user the guess is too high
            }
            // Check if the guessed number is lower than the target number
            else if(guess < targetNumber){
                System.out.println("Too low! Try again.");  // Inform the user the guess is too low
            }
            // If the guessed number matches the target number
            else{
                System.out.println("Congratulations! You guessed the number correctly!");  // Congratulate the user
                return;  // Exit the method, ending the game
            }
        }
    }

}
