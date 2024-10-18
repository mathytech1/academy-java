package com.bptn.course.week4.file_handling_basics;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		if (file.exists()) {
			System.out.println("File Deleted Successfuly!");
			file.delete();
		} else {
			System.out.println("File not found");
		}

	}

}
