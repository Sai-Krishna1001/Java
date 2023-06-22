package com.java8.lambdaexp;

interface Shape{
	void draw();
}

/*
 * class Rectangle implements Shape{
 * 
 * @Override public void draw() {
 * System.out.println("Rectangle class : draw() method");
 * 
 * }
 * 
 * } class Circle implements Shape{
 * 
 * @Override public void draw() {
 * System.out.println("Circle class : draw() method");
 * 
 * }
 * 
 * } class Square implements Shape{
 * 
 * @Override public void draw() {
 * System.out.println("Square class : draw() method");
 * 
 * }
 * 
 * }
 */
public class LambdaExample {

	public static void main(String[] args) {
		
		/*
		 * Shape rectangle = () ->
		 * System.out.println("Rectangle class : draw() method"); //rectangle.draw();
		 * 
		 * Shape circle = () -> System.out.println("Circle class : draw() method");
		 * //circle.draw();
		 * 
		 * Shape square = () -> System.out.println("Square class : draw() method");
		 * //square.draw();
		 */		
		print(() -> System.out.println("Rectangle class : draw() method"));
		print(() -> System.out.println("Circle class : draw() method"));
		print(() -> System.out.println("Square class : draw() method"));
		
	}
	//passing lambda as method parameter
	private static void print(Shape shape) {
		shape.draw();
	}
}

