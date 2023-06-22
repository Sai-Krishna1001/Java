package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		
		//traditional way, filter the products based on price
		List<Product> list = new ArrayList<Product>();
		for (Product product : getProducts()) {
			if(product.getPrice() > 32000f) {
				list.add(product);
			}
		}
		for (Product product : list) {
			System.out.println(product);
		}
		
		System.out.println("=============================================");
		
		//using stream API
		List<Product> list2 = getProducts().stream().filter((product) -> 
		product.getPrice() > 32000f).collect(Collectors.toList());
		
		for (Product product : list2) {
			System.out.println(product);
		}
		
		System.out.println("=================================================");
		getProducts().stream()
			.filter((product) -> product.getPrice() > 32000f)
			.forEach(System.out::println);
		
	}
	private static List<Product> getProducts() {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP", 28000f));
		productsList.add(new Product(2, "APPLE", 82000f));
		productsList.add(new Product(3, "ACER", 25000f));
		productsList.add(new Product(4, "LENOVO", 40000f));
		productsList.add(new Product(5, "DELL", 60000f));
		
		return productsList;
	}
}