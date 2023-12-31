package com.java.synchronization;

class Braketsss{
	
	synchronized static public void generate(String threadCode) {
		for(int i = 0; i<10; i++) {
			if (i<5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println("Generated by Thread : " + threadCode);
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<5; i++) {
					Braketsss.generate("Thread 1");
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<5; i++) {
					Braketsss.generate("Thread 2");
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
