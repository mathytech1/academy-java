package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner;

public class WordEncryption {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to capture user input
        int loop = 1;  // Variable to control the loop, allowing multiple encryptions

        // Loop to allow the user to encrypt multiple strings until they choose to exit
        do {
            System.out.println("Enter a string: ");
            String str = scanner.nextLine();  // Capture the input string from the user
            String newStr = "";  // Initialize an empty string to store the encrypted result

            // Loop through each character in the input string
            for (int i=0; i<str.length(); i++){
                char c = str.charAt(i);  // Get the current character
                // If the character is an alphabet letter (uppercase or lowercase), shift it by one position
                if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                    if(c=='z'){  // Wrap 'z' to 'a'
                        c = 'a';
                    }else if(c=='Z'){  // Wrap 'Z' to 'A'
                        c = 'A';
                    }else{
                        c += 1;  // Increment the character (shift to the next letter in ASCII)
                    }
                }
                newStr += c;  // Append the (possibly shifted) character to the new string
            }

            // Output the encrypted word
            System.out.println("Encrypted word: "+newStr);
            System.out.println("Press 1 to continue or any number to exit.");
            loop = scanner.nextInt();  // Update loop control based on user input
            scanner.nextLine();  // Consume the newline character left by nextInt()
        }while(loop==1);  // Continue the loop if the user presses 1, otherwise exit

    }
}
/*
Summary:
This program allows the user to input strings and encrypts each one by shifting alphabet
characters to the next in the sequence. 'z' wraps to 'a' and 'Z' wraps to 'A', while
non-alphabet characters remain unchanged. The program loops until the user chooses to exit.
*/