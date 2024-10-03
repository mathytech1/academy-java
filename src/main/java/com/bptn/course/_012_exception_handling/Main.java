package com.bptn.course._012_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;


        try{
            System.out.println("How many numbers do you want to enter: ");
            size = scanner.nextInt();
            int[] numbers = new int[size];
            System.out.println("Enter the numbers:");
            for(int i=0; i<size; i++){
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Enter two numbers to do the division: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            double result = (double)(num1 / num2);
            System.out.println("Number at index 10 is: " + numbers[10]);
            System.out.println("Result = " + result);
        } catch(InputMismatchException e){
            System.out.println("Error: please enter the valid numbers!");
        } catch(ArithmeticException e){
            System.out.println("Cannot devide by zero");
        } catch(IndexOutOfBoundsException e){
            System.out.println("The array only contains " + size + " items");
        } finally {
            System.out.println("Program ended");
        }
    }
}
