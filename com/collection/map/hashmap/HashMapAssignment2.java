package com.collection.map.hashmap;
import java.util.HashMap;
//Remove an entry from the HashMap based on the key.
//Display the map before and after removal to observe the changes.

public class HashMapAssignment2 {
	public static void main(String[] args)
	{
		HashMap<String, Integer> h1=new HashMap<>();
		h1.put("one",10);
		h1.put("two",20);
		h1.put("three",30);
		h1.put("four",40);
		h1.put("five",50);
		
		System.out.println("The hashmap is: "+h1);
		h1.remove("two");
		System.out.println("The hashmap after removing one pair is: "+h1);

		
	}

}
