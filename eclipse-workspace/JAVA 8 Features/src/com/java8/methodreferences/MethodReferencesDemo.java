package com.java8.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable
{
	void prints(String msg);
}

public class MethodReferencesDemo {
	
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
		
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		// 1. Method reference to a static method
		// lambda expression
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(10));
		
		// using method reference
		Function<Integer, Double> functionMethodRef =  Math::sqrt;
		System.out.println(functionMethodRef.apply(1001));
		
		// lambda expression
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferencesDemo.addition(a, b);
		System.out.println(biFunctionLambda.apply(10, 20));
		
		// using method reference
		BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferencesDemo::addition;
		System.out.println(biFunctionMethodRef.apply(12, 21)); 
		
		// 2. Method reference to an instance method of an object
		MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
		
		// lambda expression
		Printable printable = (msg) -> methodReferencesDemo.display(msg);
		printable.prints("Hello world");

		// using method reference
		Printable printableMethodRef = methodReferencesDemo::display;
		printableMethodRef.prints("Hello Krishna");
		
		// 3. Reference to the instance method of an arbitrary object
		// Sometimes, we call a method of argument in the lambda expression.
		// In that case, we can use a method reference to call an instance
		// method of an arbitrary object of a specific type.
		
		// lambda expression
		Function<String, String> stringFunction = (String input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("Hello Sai"));
		
		// using method reference
		Function<String, String> stringFunctionMethodRef = String::toLowerCase;
		System.out.println(stringFunctionMethodRef.apply("Hello Sai"));
		
		String[] strArray = {"a","e", "i","o","u","A","E","I","O","U"};
		// lambda expression
		Arrays.sort(strArray, (s1,s2) -> s1.compareToIgnoreCase(s2));
		for (String string : strArray) {
			System.out.print(string);
		}
		System.out.println();
		
		String[] strArray2 = {"a","e", "i","o","u","A","E","I","O","U"};
		// using method reference
		Arrays.sort(strArray2, String::compareTo);
		for (String string : strArray2) {
			System.out.print(string);
		}
		System.out.println();
		// 4. Reference to a Constructor
		List<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		
		// using lambda
		Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
		System.out.println(setFunction.apply(fruits));
		
		// using method reference
		Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
		System.out.println(setFunctionMethodRef.apply(fruits));
	} 

}
