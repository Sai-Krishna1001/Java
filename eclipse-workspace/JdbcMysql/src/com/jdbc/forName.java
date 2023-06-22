package com.jdbc;

public class forName {

	public static void main(String[] args) throws ClassNotFoundException {
		// new Xyz(); --> in static, in instance
		Class.forName("com.mysql.jdbc.Driver");
	}
}
class Xyz{
	
	static 
	{
		System.out.println("in static");
	}
	
	//instance
	{
		System.out.println("in instance");
	}
}
