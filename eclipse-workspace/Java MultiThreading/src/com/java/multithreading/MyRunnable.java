package com.java.multithreading;

import java.util.Random;

public class MyRunnable implements Runnable {

	private int threadNo;
	
	public MyRunnable(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for(int i = 0; i<9; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("The value if is "+i+" and the threadNo is " + threadNo);
		}
		
	}
	
	public static void main(String[] args) {
		
//		Thread thread1 = new Thread(new MyRunnable(1));
//		Thread thread2 = new Thread(new MyRunnable(2));
//		thread1.start();
//		thread2.start();
		
		// Anonymous Thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<9; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		}).start();
	}

}
