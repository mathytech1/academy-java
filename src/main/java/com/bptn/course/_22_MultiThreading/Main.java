package com.bptn.course._22_MultiThreading;

public class Main {
	public class MathUtils {
		public static int add(int a, int b) {
			// System.out.println(a + b);
			return a + b;
		}
	}

	public static void main(String[] args) {

		int result = MathUtils.add(5, 3);
		System.out.println("The sum is: " + result);

//		long start1 = System.nanoTime();
//		// Create two SumCalculator threads to calculate the sum of two different ranges
//		SumCalculator sumCalculator1 = new SumCalculator(1, 500000);
//		SumCalculator sumCalculator2 = new SumCalculator(500001, 1300000);
//		SumCalculator sumCalculator3 = new SumCalculator(1300001, 2000000);
//		// Start both threads
//		sumCalculator1.start();
//		sumCalculator2.start();
//		sumCalculator3.start();
//
//		try {
//			// Wait for both threads to finish using join() method of each thread.
//			sumCalculator1.join();
//			sumCalculator2.join();
//			sumCalculator3.join();
//		} catch (InterruptedException e) {
//			// Print the stack trace if an interruption occurs
//			e.printStackTrace();
//		}
//
//		// Calculate the total sum by adding the sum of both ranges
//		int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
//
//		// Print the total sum
//		System.out.println("Total sum: " + totalSum);
//		long end1 = System.nanoTime();
//		System.out.println("Time it took: " + (end1 - start1));

//		long sum = 0;
//		long start1 = System.nanoTime();
//		for (int i = 1; i <= 2000000000; i++) {
//			sum += i;
//		}
//		long end1 = System.nanoTime();
//		System.out.println("Time it took: " + (end1 - start1));

//		String hola = "Hello World!";
//		boolean isEqual = !(hola == "Hello World!");
//		System.out.println(isEqual);

//		

//		ArrayList<Integer> nums = new ArrayList<>();
//		nums.add(2);
//		nums.add(4);
//		nums.add(6);
//		nums.add(8);
//		nums.add(10);
//		nums.add(2);
//
//		int val1 = 0;
//		int val2 = 5;
//
//		boolean isEqual = (!nums.get(val1).equals(nums.get(val2)));
//		System.out.println(isEqual);

//		Car oneCar = new Car();
//        car.startEngine(); 
//        
//        Vehicle twoCar = new Car(); 
//        anotherCar.startEngine(); 

	}
}
//
//class Vehicle {
//    public void startEngine() {
//        System.out.println("Starting the engine...");
//    }
//}
//
//class Car extends Vehicle {
//    @Override
//    public void startEngine() {
//        System.out.println("Car engine started. Ready to go!");
//    }
//}
