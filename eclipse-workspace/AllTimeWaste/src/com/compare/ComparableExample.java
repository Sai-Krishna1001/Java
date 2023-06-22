package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 1700));
		laps.add(new Laptop("Lenovo", 8, 1400));

		Collections.sort(laps);
		
		System.out.println(laps);
	}

}
