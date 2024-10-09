package com.bptn.course.universityOfStudents;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {

		// Start by looking in the University and Student classes. Implement the
		// methods.

		// Create a bunch of student objects
		// (Make sure one student has the following studentId: 123)
		// (Make sure one other student has the following username: testUsername1)

		// Create instance of university called "university" and populate it with the
		// students.
		// Student(long studentId, String userName, String password, String firstName,
		// String lastName, String email,
		// String phone, String address, String gender, Date birthdate, Date
		// admissionDate, long rollNumber,
		// String curriculumName)

		Calendar calendar = Calendar.getInstance();
		// Set birthdate
		calendar.set(2000, Calendar.JANUARY, 1);
		Date birthdate = calendar.getTime();
		// Set admission date
		calendar.set(2024, Calendar.SEPTEMBER, 10);
		Date admissionDate = calendar.getTime();

		Student student = new Student(123, "mathewos123", "abc123", "Mathewos", "Beyene", "math@gmail.com", "123456",
				"202 sky st", "Male", birthdate, admissionDate, 10001, "Computer Science");

		calendar.set(1998, Calendar.JANUARY, 1);
		birthdate = calendar.getTime();
		calendar.set(2024, Calendar.SEPTEMBER, 1);
		admissionDate = calendar.getTime();
		Student student2 = new Student(124, "george45", "testUsername1", "George", "Cooper", "george@gmail.com",
				"345678", "202 salt st", "Male", birthdate, admissionDate, 10001, "Computer Science");

		University university = new University();

		university.addStudent(student);
		university.addStudent(student2);

		System.out.println("\nUniversity ------ \n" + university.students);
		System.out.println("\nGetting student------\n" + university.getStudent(123));
		System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
		System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

		System.out.println("\nUniversity ------ \n" + university.students);

	}
}