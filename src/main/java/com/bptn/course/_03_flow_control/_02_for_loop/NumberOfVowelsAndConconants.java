package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner;

public class NumberOfVowelsAndConconants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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
