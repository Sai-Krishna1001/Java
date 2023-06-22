package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,2,1);
		
		//findFirst() and findAny() methods
		
		Optional<Integer> element = list.stream().findFirst();
		
		if(element.isPresent())
			System.out.println(element.get());
		else
			System.out.println("stream is empty");
		
		Optional<Integer> element2 = list.stream().findAny();
		
		if(element.isPresent())
			System.out.println(element.get());
		else
			System.out.println("stream is empty");
		
	}

}
