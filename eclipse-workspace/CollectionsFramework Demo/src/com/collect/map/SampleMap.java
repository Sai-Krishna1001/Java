package com.collect.map;

import java.util.HashMap;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class SampleMap {
	void addElementInHashtable() {
		Map<Integer, String> m1 = new Hashtable<Integer, String>();
		m1.put(1, "Score1");
		m1.put(2, "Score2");
		m1.put(3, "Score4");
		System.out.println("The HashTable elements are " + m1);
		// m1.put(null, "Score3");//it throws NullPointerException
		// m1.put(3, null);
		m1.put(3, "Score3");
		System.out.println("The HashTable elements are " + m1);
	}
	void addElementInHashMap() {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "N1");
		hm.put(2, "N2");
		hm.put(3, null);
		hm.put(4, null);
		hm.put(4, "N4");
		hm.put(null, "N5");
		hm.put(null, "N6");
		System.out.println("The HashMap Elements are " + hm);
	}
	void addElementinLinkedHashMap() {
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "m1");
		lhm.put(3, "j1");
		lhm.put(2, "m2");
		lhm.put(null, null);
		//lhm.put(null,"m3");
		lhm.put(4, null);
		
		System.out.println("The LinkedHashMap Elements are " + lhm);
	}
	
	void addElementinTreeMap()
	{
		Map<Integer,String> tm=new TreeMap<Integer, String>();
		tm.put(5, "Tm1");
		tm.put(2, "Tm3");
		tm.put(3, "Tm2");
		tm.put(0, "Tm4");
		tm.put(2, null);
		tm.put(4, null);
		
		
		
		System.out.println("The TreeMap Elements are "+tm);
		System.out.println("The key of Treemap is "+tm.keySet());//print only key
		System.out.println("The value of Treemap is "+tm.values());//print only values
		
		
		//tm.forEach((key,value) -> System.out.println(key +" : " +  value));
		
		for(int key : tm.keySet())
		{
			String value = tm.get(key);
			System.out.println(key + " : " + value);
		}
	}
	public static void main(String[] args) {
		SampleMap tmi = new SampleMap();
		tmi.addElementinTreeMap();
	}
}