package com.bptn.course._22_MultiThreading;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Thread.currentThread().getState());
//		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().isAlive());
//		Thread.currentThread().setName("MAIN");
//		Thread.currentThread().setPriority(MAX_PRIORITY);
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());\

		ThreadDemo td = new ThreadDemo();
		System.out.println(td.getName());

		ThreadDemo td1 = new ThreadDemo();
		System.out.println(td1.getName());

		td.start();
		td1.start();
	}

}
