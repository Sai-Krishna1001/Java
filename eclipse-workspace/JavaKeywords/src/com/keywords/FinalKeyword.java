package com.keywords;

// if you make any variable as final, you cannot change the value of final variable(It will be constant).
// if you make any method as final, you cannot override it.
// if you make any class as final, you cannot extend it.

//final class F{
//	final void fun() {
//		System.out.println("krishna");
//	}
//}

public class FinalKeyword // extends F
{
	
	int a = 10;
	final int b = 20;
//	void fun() {
//		System.out.println("sai");
//	}
	
	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		fk.a = 100;
		System.out.println(fk.a);
		//fk.b = 200; --> throws compilation error
		
//		F f = new FinalKeyword();
//		f.fun();
		
	}
}
