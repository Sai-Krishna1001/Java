package com.java.multithreading;

public class ThreadMethods  extends Thread{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		ThreadMethods t1 = new ThreadMethods();
		ThreadMethods t2 = new ThreadMethods();
		ThreadMethods t3 = new ThreadMethods();
		ThreadMethods t4 = new ThreadMethods();
		
		t1.start();
		t2.start();
		t2.suspend();
		t3.start(); 
		t4.start(); 

	}

}
