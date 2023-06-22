package com.java.synchronization;
class Braketss{
	
	public void generate() {
		
		Object lock = "lock";
		// Synchronized Block on Object
		synchronized(lock) {
			for(int i = 0; i<10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i<5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			} 
		}
		System.out.println();{
			
		for(int j = 0; j<10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
}

/*
 * Synchronized Method Approach
 * Time Required: 5508
 * 
 * Synchronized Block Approach
 * Time Required: 3802
 * 
 * Synchronized Block on Object
 * Time Required: 3785
 */
public class SynchronizedBlockOnObject {

	public static void main(String[] args) {
		
		Braketss braket = new Braketss();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 0; i<5; i++) {
					braket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread1 was : "+ (endTime-startTime));
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 0; i<5; i++) {
					braket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread2 was : "+ (endTime-startTime));
			}
		});
		
		t1.start();
		t2.start();
	}

}


