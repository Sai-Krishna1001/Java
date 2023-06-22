package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		//Ascending order
		
		//to sort the elements using stream api
		List<String> sortedList = fruits.stream()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println(sortedList );
		System.out.println("======================================");
		
		//using stream + lambda expression 
		List<String> sortedList2 = fruits.stream()
					.sorted((o1,o2) -> o1.compareTo(o2))
					.collect(Collectors.toList());
		System.out.println(sortedList2);
		System.out.println("======================================");
		//stream
		fruits.stream().sorted().forEach(System.out::println);
		System.out.println("=========================================");
		
		//Descending order
		List<String> sortList = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortList);
		
		System.out.println("===========================================");
		List<String> sortList2 = fruits.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortList2);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 25, 30000));
		employees.add(new Employee(20, "Santosh", 28, 25000));
		employees.add(new Employee(30, "Krishna", 30, 55000));
		employees.add(new Employee(40, "Srinivas", 26, 36000));
		employees.add(new Employee(50, "Jhonny", 32, 28000));
		//sort employees by salary in ascending order
		List<Employee> sortBySalary =  employees.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		
		System.out.println("=====================================================");
		for (Employee employee : sortBySalary) {
			System.out.println(employee);
		}
		System.out.println("=====================================================");
		//sort employees by salary in descending order
		employees.stream().sorted((o1,o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.forEach(System.out::println);
		
		System.out.println("==============================================");
		List<Employee> sortBySalary2  = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList()); //Ascending order
		for (Employee employee : sortBySalary2) {
			System.out.println(employee);
		}
		
		System.out.println("=====================================================");
		List<Employee> sortBySalary3  = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList()); //Descending order
		for (Employee employee : sortBySalary3) {
			System.out.println(employee);
		}
		
		//sort employees by name in ascending order
		System.out.println("=====================================================");
		List<Employee> sortByName  = employees.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList()); //Ascending order
		for (Employee employee : sortByName) {
			System.out.println(employee);
		}
		
		//sort employees by age in descending order
		System.out.println("=====================================================");
		List<Employee> sortbyAge = employees.stream()
				.sorted(Comparator.comparingInt(Employee::getAge).reversed())
				.collect(Collectors.toList());
		for (Employee employee : sortbyAge) {
			System.out.println(employee);
		}
	}

}
