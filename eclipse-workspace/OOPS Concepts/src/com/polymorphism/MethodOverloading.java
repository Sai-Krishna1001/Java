package com.polymorphism;

class Name
{
	//Method Overloading
	void display(String FName)
	{
		System.out.println("firstName is " + FName);
	}
	void display(String FName, String LName)
	{
		System.out.println("FullName is " + FName +" "+ LName);
	}
	
	//Constructor Overloading
	String FName,LName;
	public Name()
	{
		this.FName = "SK";
		this.LName = "G";
		System.out.println("fullname is "+ FName + LName);
	}
	public Name(String FName, String LName) {
		this.FName = FName;
		this.LName = FName;
		System.out.println("fullname is " + FName + LName);
		
	}
	
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		Name n1 = new Name();
		n1.display("Sai Krishna");
		n1.display("Sai Krishna","Gedda");
		
		Name n2 = new Name("A","B");
		n2.display("SK");
		
		
	}

}
