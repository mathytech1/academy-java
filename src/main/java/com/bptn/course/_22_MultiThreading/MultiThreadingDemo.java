package com.bptn.course._22_MultiThreading;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());

		t1.start();
		t2.start();
	}

}
