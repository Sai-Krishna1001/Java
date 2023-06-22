package com.java.basics;

public class CheckCode extends Thread {

	public void run() {
		for(int  i= 1; i<3; ++i) {
			System.out.println(i + "..");
		}
	}
	
	
	public static void main(String[] args) {
		
		CheckCode cc = new CheckCode();
		//Thread t = new Thread();
		cc.run();

	}


	
}
