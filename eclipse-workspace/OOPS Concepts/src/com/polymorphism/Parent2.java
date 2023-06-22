package com.polymorphism;

public class Parent2 
{
	void show()
	{
		System.out.println("parent2 mehtod show");
	}
}
class Child1 extends Parent2
{
	void show()
	{
		System.out.println("child1 method show");
	}
}
class Child2 extends Parent2
{
	void show()
	{
		System.out.println("child2 mehtod show");
	}
}