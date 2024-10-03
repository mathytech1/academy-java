package com.bptn.course._09_inheritance;

public class Student {
	String name;
	double grade;
	String studentID;
	static int nextID = 100;
	static String principalName = "Ms. Jessica";
	
	Student(String name, double grade){
		this.name = name;
		this.grade = grade;
		studentID = "" + Character.toUpperCase(name.charAt(0)) + nextID;
		nextID++;
	}
	
	static void setNewPricipal(String principalName) {
		principalName = principalName;
	}
	
	public String toString() {
		return "Student name: " + name + "\nGrade: " + grade + "\nPrincipal: " + principalName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Merry", 95);
		System.out.println(s1);
		
		Student.setNewPricipal("Mr. George");
		Student s2 = new Student("Abel", 94.6);
		System.out.println(s2);
		
	}

}
