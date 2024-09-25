package com.bptn.course.hello;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int score = 93;
	     String grade = "";

	     if (score >= 90) {
	         grade = "A";
	     } 
	     if (score >= 80) {
	         grade = "B";
	     }
	     if (score >= 70) {
	        grade = "C";
	     }
	     if (score >= 60) {
	         grade = "D";
	     } else {
	       grade = "F";
	     }
	     
	     System.out.println(grade);
	}

}
