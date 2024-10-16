package com.bptn.course.week4._student_score_challange;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreAggregator {

	public static Map<String, Double> calculateAverage(Map<String, Student> students) {

		Map<String, Double> studentsAverage = new HashMap<>();

		for (Student student : students.values()) {
			double sum = 0.0;
			for (Double score : student.getSubjectScores().values()) {
				sum += score;
			}

			double average = sum / student.getSubjectScores().size();
			studentsAverage.put(student.getName(), average);
		}

//		double sum = 0.0;
//
//		for (Double score : student.getSubjectScores().values()) {
//			sum += score;
//		}
//
//		double average = sum / student.getSubjectScores().size();

		return studentsAverage;
	}

	public static void main(String[] args) {
		Map<String, Double> scores1 = new HashMap<>();
		scores1.put("course1", 90.0);
		scores1.put("course2", 75.5);
		scores1.put("course3", 98.3);

		Map<String, Double> scores2 = new HashMap<>();
		scores2.put("course1", 80.0);
		scores2.put("course2", 95.5);
		scores2.put("course3", 38.3);

		Map<String, Student> students = new HashMap<>();
		students.put("Mathew", new Student("Mathew", scores1));
		students.put("James", new Student("James", scores2));

		// Student s1 = new Student("Student One", scores);

		// System.out.printf("The average score is: %.2f", calculateAverage(students));

		Map<String, Double> studAverages = calculateAverage(students);
		System.out.println("Name  -  Average");
		for (String name : studAverages.keySet()) {
			System.out.printf("%s - %.2f \n", name, studAverages.get(name));

		}
	}

}
