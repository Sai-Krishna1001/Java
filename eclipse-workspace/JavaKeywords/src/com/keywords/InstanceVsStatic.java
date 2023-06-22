package com.keywords;


//instance --> object creation is mandatory
//static --> object creation is not necessary

//instance variables --> to allocates memory, when object is created
//static variables --> to allocates memory when class file loaded

public class InstanceVsStatic {
	int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		
		System.out.println(obj1.x); // 10
		System.out.println(obj2.x); // 10
		System.out.println(obj1.y);	// 20
		System.out.println(obj2.y); // 20
		
		obj1.x = 100;
		obj1.y = 200;
		
		System.out.println("----------");
		System.out.println(obj1.x);	// 100 
		System.out.println(obj2.x);	// 10 // x is instance variable value will not be changed
		System.out.println(obj1.y);	// 200 
		System.out.println(obj2.y);	// 200 -->for new object while using static, address will be same
		
		
				
	}
}
