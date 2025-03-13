package com.collection.map.hashmap;
import java.util.HashMap;
//Iterate through the HashMap using entrySet() and display each key-value pair.


public class HashMapAssignment3 {
	public static void main(String[] args)
	{
		HashMap<String, Integer> h1=new HashMap<>();
		h1.put("one",10);
		h1.put("two",20);
		h1.put("three",30);
		h1.put("four",40);
		h1.put("five",50);
		
		System.out.println("The iterate hashmap through entrtset");
		System.out.println(h1.entrySet());

		
	}

}
