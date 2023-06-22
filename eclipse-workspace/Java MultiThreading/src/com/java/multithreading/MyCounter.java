package com.java.multithreading;

public class MyCounter extends Thread {

	private int threadNo;
	
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		countMe();
		
	}
	public void countMe() {
		for(int i=0; i<9; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("The value of i is "+i+" and the threadNo is " + threadNo);
		}
	}

	public static void main(String[] args) {
		
		MyCounter counter1 = new MyCounter(MIN_PRIORITY);
		MyCounter counter2 = new MyCounter(MAX_PRIORITY);
		
		long startTime = System.currentTimeMillis();
		//counter1.countMe();
		//counter1.run(); 
		counter1.start(); // Run should be called by JVM
		System.out.println("*******************************************************");
		//counter2.countMe();
		//counter2.run(); 
		counter2.start(); //// Run should be called by JVM
		try {
			Thread.sleep(4505);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time Required to Process: "+ (endTime-startTime));

	}

}
