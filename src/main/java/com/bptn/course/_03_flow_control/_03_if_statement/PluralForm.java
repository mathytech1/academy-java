package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class PluralForm {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);  // Scanner object to capture user input
	        int amt, loop=1;  // Variables to hold the amount and loop control
	        String word;  // Variable to hold the input word

	        // Loop to allow the user to input multiple words until they choose to exit
	        do {
	            System.out.print("# in: ");  // Prompt for the amount
	            amt = scanner.nextInt();  // Read the amount
	            System.out.print("word: ");  // Prompt for the word
	            word = scanner.next();  // Read the word
	            String newStr = "";  // Initialize an empty string for the plural form

	            // If the amount is 1, the plural form is the same as the word
	            if(amt==1){
	                newStr = word;
	            }else {
	                char y = word.charAt(word.length()-1);  // Get the last character of the word
	                String lastTwo = word.substring(word.length()-2);  // Get the last two characters of the word

	                // Check specific conditions for pluralization based on the last two characters
	                if(lastTwo.equals("fe")){
	                    newStr = word.substring(0,word.length()-2) + "ves";  // Replace "fe" with "ves"
	                }else if(lastTwo.equals("sh") || lastTwo.equals("ch")){
	                    newStr = word + "es";  // Add "es" for words ending in "sh" or "ch"
	                } else if (lastTwo.equals("us")) {
	                    newStr = word.substring(0, word.length()-2) + "i";  // Replace "us" with "i"
	                } else if(y=='y'){  // Check if the last character is 'y'
	                    // Handle special cases for 'y'
	                    if(lastTwo.equals("ay") || lastTwo.equals("oy") || lastTwo.equals("ey") || lastTwo.equals("uy")){
	                        newStr = word + "s";  // Just add "s" if 'y' is preceded by certain letters
	                    }else{
	                        newStr = word.substring(0,word.length()-1) + "ies";  // Replace 'y' with "ies"
	                    }
	                }else {
	                    newStr = word + "s";  // Default case: just add "s"
	                }
	            }

	            // Output the amount and the plural form
	            System.out.println(amt + " " + newStr);
	            System.out.print("Press 1 to continue or any number to exit: ");  // Prompt to continue or exit
	            loop = scanner.nextInt();  // Read user's choice
	        }while(loop==1);  // Continue looping if the user presses 1
	    }

}
