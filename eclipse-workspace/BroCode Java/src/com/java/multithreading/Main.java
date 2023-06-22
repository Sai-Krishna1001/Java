package com.java.multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// MultiThreading =	Process of executing multiple threads simultaneously
		//					Helps maximum utilization of CPU
		//					Threads are independent, they don't affect the execution of other threads
		//					An exception in one thread will not interrupt other threads
		//					Useful for serving multiple clients, multiplayer games, or other mutually independent tasks
		
		
		//Create a subclass of Thread
		MyThread thread1 = new MyThread();
		
		//or
		
		//Implement Runnable interface and pass instance as an argument to Threads 
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		//thread1.setDaemon(true);
		//thread2.setDaemon(true);
		
		thread1.start();
		//thread1.join(3000); // calling thread (eg: main) wait until the specified thred dies or for X milliseconds
		thread2.start();
		
		//System.out.println(1/0);
	}

}
