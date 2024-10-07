package com.bptn.course.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable{
	private static final long serialVersionUID = 5701624788640090036L;
	private final String name;
	private int number;
	
	public Vehicle(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", number=" + number + "]";
	}
	
	
}
