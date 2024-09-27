package com.bptn.course.Practice;

import java.util.Scanner;

public class Factorial {
	public static int numberOfSteps(int num) {
        int steps = 0;

        // Fill in the code below based on the problem statement
        while(num>=0){
            if(num%2==0){
                num = num / 2;
            }else{
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 123;
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce "+num+" to zero: "+steps);

        System.out.println("Enter the String:");
        String str = input.nextLine();
        String lowerStr = str.toLowerCase();
        short vowelCount = 0;
        short consonantCount = 0;

        for(int i=0; i<str.length();i++){
            char c = lowerStr.charAt(i);
            if(c=='a'  || c=='e' ||  c=='i' || c=='o' || c=='u'){
                vowelCount++;
            }else if(c>='a' && c<='z'){
                consonantCount++;
            }
        }
        System.out.println("The number of vowels: "+vowelCount);
        System.out.println("The number of constants: "+consonantCount);
    }
}
