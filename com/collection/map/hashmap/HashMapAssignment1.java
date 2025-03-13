package com.collection.map.hashmap;
import java.util.HashMap;
//Create a HashMap to store names (String) as keys and ages (Integer) as values.
//Add five entries to the map and display each key-value pair.

public class HashMapAssignment1 {
	public static void main(String[] args)
	{
		HashMap<String, Integer> h1=new HashMap<>();
		h1.put("one",10);
		h1.put("two",20);
		h1.put("three",30);
		h1.put("four",40);
		h1.put("five",50);
		
		System.out.println("The hashmap is :"+h1);
		
		

	}

}
