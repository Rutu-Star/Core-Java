package com.collection.map.hashmap;
import java.util.HashMap;
import java.util.Map.Entry;;
//Use a different method to iterate, such as keySet() or forEach().

public class HashMapAssignment4 {
	public static void main(String[] args)
	{
		HashMap<String, Integer> h1=new HashMap<>();
		h1.put("one",10);
		h1.put("two",20);
		h1.put("three",30);
		h1.put("four",40);
		h1.put("five",50);
		
		System.out.println("The iterate hashmap through keyset");
		System.out.println(h1.keySet());
		System.out.println("The iterate hashmap through values");
		System.out.println(h1.values());
		System.out.println("The iterate hashmap through for-each loop by using key ");
		
		for(String k:h1.keySet())
		{
			System.out.println(k);
		}
		
		System.out.println("The iterate hashmap through for-each loop by using values ");
		
		for(Integer i:h1.values())
		{
			System.out.println(i);

		}
		
		System.out.println("The iterate hashmap through for-each loop by using key and values ");

		h1.forEach((key,value)->System.out.println(key+", "+value));

		System.out.println("The iterate hashmap through for-each loop by using entry  ");

		for(Entry<String , Integer> p:h1.entrySet())
		{
			System.out.println(p.getKey()+", "+p.getValue());
		}
		
		
	}

}
