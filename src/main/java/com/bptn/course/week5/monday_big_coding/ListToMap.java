package com.bptn.course.week5.monday_big_coding;

import java.util.ArrayList;
//Import necessary packages for List, ArrayList, Map, and Stream API
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	// Create a static method to convert a List of Students to a Map
	static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
		// Use stream() to convert the students list into a stream for processing
		// collect() is used to transform the stream into a map using the
		// Collectors.toMap() method
		// Student::getId is a method reference to extract the student id as the key for
		// the map
		// student -> student is a lambda expression to map each Student object itself
		// as the value in the map
		return students.stream().collect(Collectors.toMap(Student::getId, student -> student));
	}

	// Complete the main method to test the functionality
	public static void main(String[] args) {

		// Create a list of Student objects
		List<Student> students = new ArrayList<>();

		// Add Student objects to the list
		students.add(new Student(1, "Alice", 20));
		students.add(new Student(2, "Bob", 22));
		students.add(new Student(3, "Charlie", 21));

		// Call convertStudentListToMap() to transform the list into a map, where the
		// student ID is the key
		Map<Integer, Student> studentMap = convertStudentListToMap(students);

		// Print the generated map to verify the conversion
		System.out.println("Students Map: " + studentMap);
	}
}

/*
 * Summary: In this task, I worked on converting a list of students into a map
 * where the student's ID is used as the key, and the Student object itself is
 * the value. The `stream()` method is used to process the list, and
 * `collect(Collectors.toMap())` allows us to convert the list into a map. The
 * use of a method reference (`Student::getId`) helps in cleanly extracting the
 * student's ID, while the lambda expression (`student -> student`) maps the
 * actual student objects as values.
 * 
 * The main new aspect of this task was applying the Stream API for list-to-map
 * conversion and understanding method references for mapping keys in the
 * stream. One issue I faced was initially getting familiar with
 * `Collectors.toMap()` syntax, but after reviewing how method references and
 * lambdas work together, it became more straightforward.
 * 
 * In the future, I will remember how useful the Stream API is for transforming
 * collections and how method references can simplify code.
 */
