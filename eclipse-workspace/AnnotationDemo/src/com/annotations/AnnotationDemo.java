package com.annotations;

import java.util.ArrayList;

@FunctionalInterface
interface Abc{
	
	void show();
	//void display();
}
class A{
	public void showMydataFromLastYearDatabase() {
		System.out.println("in A");
	}
}
class B extends A{
	
	@Deprecated
	public void show() {
		
	}

	@Override
//	@Override
//	public void showMydataFromLastYearDataBase() {
	public void showMydataFromLastYearDatabase() {
		@SuppressWarnings("rawtypes")
		ArrayList obj = new ArrayList();
		System.out.println("in B");
	}
}

public class AnnotationDemo {
	
	public static void main(String[] args) {
		B b = new B();
		b.showMydataFromLastYearDatabase();
		b.show();
	}
}
