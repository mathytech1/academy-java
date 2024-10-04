package com.bptn.course.friday02;

public class Employee {
	// Instance variable to store salary
	   private int salary ;

	   // Instance variable to store hours per day worked by employee
	   private int hoursPerDay;

	   // Constructor to set instance variables(salary and hoursPerDay) value 
	   public Employee(int salary, int hoursPerDay){
	    setSalary(salary);
	    setHoursPerDay(hoursPerDay);    
	   }

	   // Set method to update salary
	   public int setSalary(int salary){
	    if(salary < 500){
	      return this.salary = salary + 10;
	    }
	    return this.salary = salary;
	   }

	   // Set method to update hoursPerDay
	   public int  setHoursPerDay(int hoursPerDay){
	    this.hoursPerDay = hoursPerDay;
	    if(hoursPerDay > 6){
	      return this.salary += 5;
	    }
	    return this.salary;

	   }

	   // Get method to return salary
	   public int getSalary(){
	    return this.salary;
	   }
}
