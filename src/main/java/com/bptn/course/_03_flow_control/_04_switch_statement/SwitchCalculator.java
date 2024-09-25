package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the menu!");
        System.out.println("Please choose an item from the list: ");
        System.out.println("1. Pizza - $12.99");
        System.out.println("2. Burger - $8.99");
        System.out.println("3. Pasta - $9.99");
        System.out.println("4. Salad - $6.99");
        System.out.println("5. Exit");

        int choice;
        double sum = 0;

        do{
        	choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("You ordered Pizza!");
                    System.out.println("Anything else? ");
                    sum += 12.99;
                    break;
                case 2:
                    System.out.println("You ordered Burger!");
                    sum += 8.99;
                    break;
                case 3:
                    System.out.println("You ordered Pasta!");
                    System.out.println("Anything else? ");
                    sum += 9.99;
                    break;
                case 4:
                    System.out.println("You ordered Salad!");
                    System.out.println("Anything else? ");
                    sum += 6.99;
                    break;
                case 5:
                    System.out.println("Thank you for stopping by!");
                    System.out.println("Anything else? ");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    System.out.println("Please Enter the right choice");
            }

        }while( choice!= 5);
        
        System.out.println("Your total order is: "+sum);
        // 1. Allow multiple selections
        // 2. Calculate total price for the order
        // 3. While exiting, show the total price

    }
}
