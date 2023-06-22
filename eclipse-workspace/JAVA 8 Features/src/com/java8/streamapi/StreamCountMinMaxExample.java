package com.java8.streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamCountMinMaxExample {

	public static void main(String[] args) {
		
		//count(), min() and max() methods
		
		Stream<Integer> stream = Stream.of(80, 50, 20, 90, 30, 70, 40, 10, 60);
		System.out.println("count = " + stream.count());
		
		Integer min = Stream.of(80, 50, 20, 90, 30, 70, 40, 10, 60).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("min value = " + min);
		
		Integer Max = Stream.of(80, 50, 20, 90, 30, 70, 40, 10, 60).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max value = " + Max);
	}

}
