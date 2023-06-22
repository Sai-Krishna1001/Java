package com.java.synchronization;

public class App {

	// Without Synchronization
	public static int counter = 0;
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					App.counter++;
				}
				System.out.println("The loops in the Thread1 is Over");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					App.counter++;
				}
				System.out.println("The loops in the Thread2 is Over");
			}
		});
		
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		
		System.out.println("The value of counter is : " + App.counter);
		

	}

}
