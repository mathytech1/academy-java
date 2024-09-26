package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner;

public class MobileData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] price = {10, 30, 50, 70};

        System.out.println("Welcome to the Mobile Data Plan Selector!");
        System.out.println("Please select a data plan: ");
        System.out.println("1. 1 GB - $"+price[0]);
        System.out.println("2. 5 GB - $"+price[1]);
        System.out.println("3. 10 GB - $"+price[2]);
        System.out.println("4. Unlimited - $"+price[3]);
        System.out.println("5. Exit\n");
        System.out.println("Enter the number corresponding to your choice: ");

        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                System.out.println("You have selected the 1 GB plan");
                break;
            case 2:
                System.out.println("You have selected the 5 GB plan");
                break;
            case 3:
                System.out.println("You have selected the 10 GB plan");
                break;
            case 4:
                System.out.println("You have selected the unlimited plan");
                break;
            case 5:
                System.out.println("Thank you for stopping by!");
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        System.out.println("The total cost of your selected plan is: $"+price[choice-1]);
    }
}
