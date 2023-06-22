package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Lappy> laps = new ArrayList<Lappy>();
		
		laps.add(new Lappy("Dell", 16, 800.8));
		laps.add(new Lappy("Apple", 8, 800.4));
		laps.add(new Lappy("Acer", 12, 800.5));
		laps.add(new Lappy("Lenovo", 8, 800.3));
		
		Comparator<Lappy> com = new Comparator<Lappy>() {

			@Override
			public int compare(Lappy o1, Lappy o2) {
				if(o1.getPrice()>o2.getPrice())
					return 1;
				else
					return -1;
			}
			
		};
		
		Collections.sort(laps,com);
		Collections.reverse(laps);
		for (Lappy lappy : laps) {
			System.out.println(lappy);
		}
	}

}
