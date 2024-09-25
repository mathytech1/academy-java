package com.bptn.course.hello;

public class StepsToZero {
	public static int numberOfSteps(int num) {
        int steps = 0;

        // Fill in the code below based on the problem statement
        while(num>0){
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
		// TODO Auto-generated method stub
		int num = 123;
		int steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce "+num+" to zero: "+steps);
	}

}
