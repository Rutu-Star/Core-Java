package com.collection.map.hashmap;
import java.util.HashMap;
import java.util.Map;

//Use the getOrDefault() method to retrieve a value from the map. If the key doesn't exist, return a default value.

public class MapAssignment2 {
	public static void main(String[] args)
	{
		Map<Integer, String> m1=new HashMap<>();
		
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		m1.put(4, "D");
		m1.put(5, "E");
		m1.put(6, "F");
		m1.put(7, "G");
		
		System.out.println("The Hahsmap is :"+m1);
		
		System.out.println(m1.getOrDefault(5, null));
		System.out.println(m1.getOrDefault(10, null));
		System.out.println(m1.getOrDefault(null, null));
		System.out.println(m1.getOrDefault(2, null));




		
	}

}
