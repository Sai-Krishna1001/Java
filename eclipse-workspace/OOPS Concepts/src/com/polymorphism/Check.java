package com.polymorphism;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Check{
	public static void main(String[] args) {
		List<Double> fnum = Arrays.asList(2.2,1.7, 2.4, 3.3, 3.5, 3.1, 1.4);
		
		Collections.sort(fnum, (a,b) ->{ return a.compareTo(b);});
		System.out.println(fnum);
	}
}