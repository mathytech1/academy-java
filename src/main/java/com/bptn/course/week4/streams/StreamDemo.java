package com.bptn.course.week4.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("apple", "cherry", "banana", "apple", "cherry");
//		List<String> newNames = names.stream().filter(fruit -> fruit.startsWith("A").toUpperCase()).toList();
//		System.out.println(newNames);
//		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> even = nums.stream().filter(n -> n % 2 == 0).toList();
//		List<String> nums = Arrays.asList("1", "2", "3", "4", "5", "6");
//		List<Integer> even = nums.stream().map(Integer::parseInt).toList();
//		even.forEach(System.out::println);

		Student s1 = new Student("Mathewos", 10001, 95.6);
		Student s2 = new Student("James", 10002, 87.0);
		Student s3 = new Student("Kamal", 10003, 92.3);
		Student s4 = new Student("Beki", 10004, 94.0);
		Student s5 = new Student("George", 10005, 85.0);

		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		List<Student> sortedStudents = students.stream().sorted(Comparator.comparing(student -> student.getName()))
				.collect(Collectors.toList());

		System.out.println("Sorted Students list:");
		sortedStudents.forEach(System.out::println);
		System.out.println();

		List<Student> above90 = students.stream().filter(student -> student.getGrade() > 90).toList();

		System.out.println("Students with grades above 90:");
		above90.forEach(System.out::println);
		System.out.println();

		List<Student> above90Sorted = students.stream().filter(student -> student.getGrade() > 90)
				.sorted(Comparator.comparing(student -> student.getName())).collect(Collectors.toList());

		System.out.println("Students with grades above 90 Sorted:");
		above90Sorted.forEach(System.out::println);
		System.out.println();

		Map<Integer, Student> map = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
		map.forEach((id, student) -> System.out.println(id + " - " + student.getName() + " - " + student.getGrade()));
	}

}

class Student {
	private String name;
	private int id;
	private double grade;

	Student(String name, int id, double grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", grade=" + grade + "]";
	}
}
