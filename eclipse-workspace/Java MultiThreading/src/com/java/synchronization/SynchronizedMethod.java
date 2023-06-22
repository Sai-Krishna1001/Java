package com.java.synchronization;

class Brakets{
	
	// Synchronized method will prevent (below method) to get executed on multiple threads simultaneously
	synchronized public void generate() {
		for(int i = 0; i<10; i++) {
			if (i<5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		
		Brakets braket1 = new Brakets();
		//Brakets braket2= new Brakets();
		//braket.generate();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<5; i++) {
					braket1.generate();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<5; i++) {
					braket1.generate();
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
