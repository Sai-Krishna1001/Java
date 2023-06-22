package com.keywords;

public class StaticKeyword {
	int x = 10;
	static String name = "krishna";
	static String str; // default null
	static int n;	//default 0
	public static void main(String[] args) {
		StaticKeyword sk = new StaticKeyword();
		System.out.println(sk.x);
				
		System.out.println(n);
		System.out.println(str);
		
		//static variable can be access in three ways:
		System.out.println(name); // 1. using directly
		System.out.println(StaticKeyword.name); // 2. using class name
		System.out.println(sk.name); // using reference variable
		
		
	}
}
