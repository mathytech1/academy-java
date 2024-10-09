package com.bptn.course.universityOfStudents;

import java.util.ArrayList;
import java.util.List;

class University {

	// property - get inspired by the UML diagram
	public ArrayList<Student> students;

	public University() {
		this.students = new ArrayList<>(); // Initialize the ArrayList here
	}

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
		students.add(s);
	}

	public Student getStudent(long studentId) {
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
		Student student = null;
		for (Student stud : students) {
			if (stud.getStudentId() == studentId) {
				student = stud;
				break;
			}
		}
		return student;
	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix
		List<Student> stud = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getUserName().startsWith(userNamePrefix)) {
				stud.add(students.get(i));
			}
		}
		return stud;
	}

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened
		boolean isDeleted = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentId() == studentId) {
				students.remove(i);
				isDeleted = true;
				break; // We break since studentId is unique
			}
		}
		return isDeleted;
	}

}
