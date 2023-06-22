package com.keywords;

// this is a reference variable that refers to the current object
//NOTE : cannot use this in a static context
//this keyword is only for non-static variables or methods

class A
{
	ThisKeyword ob;
	A(ThisKeyword ob)
	{
		this.ob = ob;
	}
	
	void display()
	{
		System.out.println("data = " + ob.data);
	}
}

class B
{
	B getB()
	{
		//this can be used to return the current class instance from the method
		return this;
	}
	
	void m1()
	{
		System.out.println("krishna");
	}
}

public class ThisKeyword
{
	int n = 10;
	int data  = 100_000;
	ThisKeyword()
	{
		//this can be passed as an argument in the constructor call
		A a = new A(this);
		a.display();
		
		System.out.println("hii");
	}
	ThisKeyword(int n)
	{
		//this() can be used to invoke current class constructor
		this();
				
		// this can be used to refer current class instance variable
		this.n = n;
		display();
		
		//this can be used to invoke current class method (implicitly)
		this.display2();//this.display2() = display2()
		
	}
	
	void display()
	{
		System.out.println("n = " + n);
	}
	
	void display2()
	{
		System.out.println("hello java");
	}
	
	void show(ThisKeyword obj)
	{
		System.out.println("welcome");
	}
	void show2()
	{
		//this can be passed as an argument in the method call
		show(this);
	}
	public static void main(String[] args)
	{
		ThisKeyword t = new ThisKeyword(90);
		
		t.show2();
		
		new B().getB().m1();
		
	}
}
