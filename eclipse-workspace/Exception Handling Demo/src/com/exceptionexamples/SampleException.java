package com.exceptionexamples;

public class SampleException {
	
	// built in exceptions
	
	public static void main(String[] args) {
		//null pointer exception
		try {
			String str = null;
			System.out.println(str.length());
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		//arithmetic exception
		try {
			int c = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide a number by zero");
		}
		//number format exception
		try {
			int n = Integer.parseInt("krishna");
			System.out.println(n);
		}
		catch(NumberFormatException e){
			System.out.println("cannot convert the alphabet to integer");
		}
		//array index out of bound exception
		try {
			int arr[] = new int[5];
			arr[7] = 10;
			System.out.println(arr[7]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
