package com.java.multithreading;

public class Main extends Thread{

	public void run() {
		
		//System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Thread"+i);
		}
	}
	public static void main(String[] args) {
		
		Main t1 = new Main();
		Main t2 = new Main();
		Main t3 = new Main();
		Main t4 = new Main();
		
		/*
		 * // MIN_PRIORITY = 1 // MAX_PRIORITY = 10 // NORM_PRIORITY = 5
		 */
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		//t3.setPriority(17);
		t1.start();
		
		try {
			t1.join();
			//t2.yield();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("t1 thread priority : " + t1.getPriority());
		t2.start();
		System.out.println("t2 thread priority : " + t2.getPriority());
		t3.start();
		
		t2.setName("krishna");
		t3.setName("gedda");
		
		System.out.println("After Changing the name of t2 : " + t2.getName());
		System.out.println("ID of t2 : " + t2.getId());
		System.out.println("After Changing the name of t3 : " + t3.getName());
		System.out.println("ID of t3 : " + t3.getId());
		
		System.out.println("Before starting thread isAlive : " + t4.isAlive());
		t4.start();
		System.out.println("After starting thread isAlive : " + t4.isAlive());
		
		
	}

}
