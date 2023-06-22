package com.polymorphism;

//Method Overriding
class Parent
{
	void m1()
	{
		System.out.println("parent class method");
	}
	
	void greet()
	{
		System.out.println("parent greet method");
	}
}
class Child extends Parent
{
	@Override
	void m1()
	{
		System.out.println("child class method");
	}
	
	void greet()
	{
		System.out.println("child greet method");
	}
	
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();
		p.greet();
		
		Child c = new Child();
		c.m1();
		c.greet();
		
	}

}
