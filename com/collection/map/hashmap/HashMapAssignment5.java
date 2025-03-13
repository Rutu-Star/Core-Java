package com.collection.map.hashmap;
import java.util.HashMap;
//Update the age of one of the names in the map.
//Display the updated map.

public class HashMapAssignment5 {

	public static void main(String[] args)
	{
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		
		hm1.put("Rutu", 19);
		hm1.put("Sayali", 20);
		hm1.put("abc", 15);
		hm1.put("xyz", 18);
		hm1.put("lmn", 22);
		System.out.println("The hashmap is : "+hm1);
		
		hm1.put("Rutu", 20);
		System.out.println("The hashmap after updating Rutu age is : "+hm1);


	}
}
