package com.collection.map.hashmap;
import java.util.HashMap;
import java.util.LinkedHashMap;
//Create a LinkedHashMap with some names and ages, adding them in a specific order.
//Display the map to check if the insertion order is maintained.

public class LinkedHashMapAssignment1 {
	public static void main(String[] args)
	{
		LinkedHashMap<String , Integer> hm1=new LinkedHashMap<String, Integer>();
		
		hm1.put("Rutuja",20);
		hm1.put("Sandhya",22);
		hm1.put("Komal",25);
		hm1.put("Sayali",24);
		hm1.put("Akansha",18);
		hm1.put("Rucha",15);
		hm1.put("Nikita",14);
		hm1.put("Pranoti",30);
		
		System.out.println("The linked hahsmap is :"+hm1);
		
		LinkedHashMap<Integer,String> hm2=new LinkedHashMap<Integer,String>();
		
		hm2.put(5,"Rutuja");
		hm2.put(6,"Sandhya");
		hm2.put(78,"Komal");
		hm2.put(1,"Sayali");
		hm2.put(null,"Akansha");
		hm2.put(58,"Rucha");
		hm2.put(10,"Nikita");
		hm2.put(8,"Pranoti");
		
		System.out.println("The linked hahsmap is :"+hm2);
		

	}

}
