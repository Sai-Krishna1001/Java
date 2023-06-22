package com.keywords;

//The super keyword in java is a reference variable which is used to refer immediate parent class object.

//Whenever you create the instance of subclass, an instance of parent class is created implicitly 
//which is referred by super reference variable.

class Device
{
	String str = "LG";
	
	Device()
	{
		System.out.println("Device constructor");
	}
	
	void display()
	{
		System.out.println("Device method");
	}
}

class TV extends Device
{
	String str = "SONY";
	
	TV()
	{
		//super() can be used to invoke immediate parent class constructor
		super();
		System.out.println("TV constructor");
	}
	void display()
	{
		//super can be used to refer immediate parent class instance variable
		System.out.println(super.str);
		System.out.println(str);
		
		//super can be used to invoke immediate parent class method
		super.display();
		System.out.println("TV method");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		TV t = new TV();
		t.display();
	}
	
}
