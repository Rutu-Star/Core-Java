package com.collection.map.hashmap;
import java.util.HashMap;
//Create two HashMaps. Copy all entries from the first map to the second map.
//Print both maps to verify the copy.


public class HashMapAssignment8 {
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm1=new HashMap<Integer, String>();
		
		hm1.put(1,"A");
		hm1.put(2,"B");
		hm1.put(3,"C");
		hm1.put(4,"D");
		hm1.put(5,"E");
		
		System.out.println("The first hashmap is :"+hm1);
		
		HashMap<Integer,String> hm2=new HashMap<Integer, String>();
		
		hm2.putAll(hm1);
		System.out.println("The second hashmap is :"+hm2);

		

	}

}
