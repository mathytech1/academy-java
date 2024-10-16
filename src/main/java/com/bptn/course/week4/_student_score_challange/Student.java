package com.bptn.course.week4._student_score_challange;

import java.util.Map;

public class Student {

	private String name;
	private Map<String, Double> subjectScores;

	public Student(String name, Map<String, Double> subjectScores) {
		this.name = name;
		this.subjectScores = subjectScores;
	}

	public String getName() {
		return name;
	}

	public Map<String, Double> getSubjectScores() {
		return subjectScores;
	}
}
