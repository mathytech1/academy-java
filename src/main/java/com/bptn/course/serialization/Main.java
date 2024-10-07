package com.bptn.course.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Vehicle bike = new Vehicle("Bike", 52141);
		Vehicle car = new Vehicle("Car", 95824);
		
		try(FileOutputStream fos = new FileOutputStream("src\\main\\java\\com\\bptn\\course\\serialization\\data\\vehicle.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("File operation was successful.");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
