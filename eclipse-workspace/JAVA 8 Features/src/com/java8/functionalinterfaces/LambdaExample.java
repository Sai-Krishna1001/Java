package com.java8.functionalinterfaces;

interface Shape{
	
	void draw();
}

/*
 * class Rectangle implements Shape{
 * 
 * @Override public void draw() { System.out.println("Rectangle draw method");
 * 
 * }
 * 
 * }
 */
public class LambdaExample {

	public static void main(String[] args) {
		
		Shape rectangle = () -> System.out.println("Rectangle draw method");
		rectangle.draw();

	}

}
