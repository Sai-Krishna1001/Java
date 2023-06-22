package com.java8.lambdaexp;

interface Addable{
	int addition(int a, int b);
}

/*
 * class AddableImpl implements Addable{
 * 
 * @Override public int addition(int a, int b) {
 * 
 * return a+b; }
 * 
 * }
 */

public class LambdaParameters {

	public static void main(String[] args) {
		
//		AddableImpl obj = new AddableImpl();
//		System.out.println(obj.addition(10,50));
		
//		Addable add = (int a, int b) -> {return a+b;};
//		int result = add.addition(90, 10);
//		System.out.println(result);

		Addable abc = (a,b) -> {
			int c = a+b;
			return c;
		};
		System.out.println(abc.addition(10,20));

	}

}
