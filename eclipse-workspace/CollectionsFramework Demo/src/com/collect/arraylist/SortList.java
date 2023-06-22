package com.collect.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		/*
		 * List<Integer> num = new ArrayList<Integer>(); num.add(40); num.add(50);
		 * num.add(10); num.add(30); num.add(20);
		 * 
		 * Collections.sort(num); //ascending order System.out.println(num);
		 * 
		 * Collections.reverse(num); //descending order System.out.println(num);
		 */
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101,"krishna",22,35000.0));
		employees.add(new Employee(104,"raju",22,25000.0));
		employees.add(new Employee(102,"jhonny",20,15000.0));
		employees.add(new Employee(103,"raghu",21,20000.0));
		
		Collections.reverse(employees);		//reverse list
		System.out.println(employees);
		
		Collections.sort(employees, new sortA());	//ascending order
		System.out.println(employees);
		
		Collections.sort(employees, new sortD());	//descending order
		System.out.println(employees);
		
		//anonymous implementation of Comparator interface
		/*
		 * Collections.sort(employees, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return (int)(o1.getSalary()-o2.getSalary()); } });
		 * System.out.println(employees); //ascending order
		 * Collections.reverse(employees); System.out.println(employees); //descending
		 * order
		 */
		
		//sort the objects of list based on attribute(Age) using Lambda expressions
		Collections.sort(employees, (o1,o2) -> (int)(o1.getAge() - o2.getAge()));
		System.out.println(employees);	//ascending order based on Age
		
		Collections.sort(employees, (o1,o2) -> (o2.getName().compareTo(o1.getName())));
		System.out.println(employees);	//descending order based on name
	}

}
class sortA implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int)(o1.getSalary()-o2.getSalary());	//implement ascending order
	}
	
}
class sortD implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int)(o2.getSalary()-o1.getSalary());	//implement descending order
	}
	
}