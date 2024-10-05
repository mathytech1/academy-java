package com.bptn.course.Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {

	public static void main(String[] args){
//		File file = new File("myFile.txt");
//		file.createNewFile();
//		System.out.println("File created");
		
//		String OS = System.getProperty("os.name").toLowerCase();
//		if(OS.indexOf("win") >= 0) {
//			System.out.println("This OS is Windows");
//		}else if(OS.indexOf("mac") >= 0) {
//			System.out.println("This OS is Mac");
//		}else {
//			System.out.println("Unkown OS");
//		}
		
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter("src\\main\\java\\com\\bptn\\course\\Practice\\myFile.txt", true));
			bw.newLine();
			bw.write("Mathewos");
			bw.newLine();
			bw.write("George");
			
			System.out.println("File operation successful!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Reading a text file using a buffered reader
		try(BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\com\\bptn\\course\\Practice\\myFile.txt"))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Reading a text file using a Scanner
		try(Scanner sc = new Scanner(new File("src\\main\\java\\com\\bptn\\course\\Practice\\myFile.txt"))){
			String line;
			while(sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
