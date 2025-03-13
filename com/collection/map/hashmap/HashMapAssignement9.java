package com.collection.map.hashmap;
import java.util.HashMap;
//Write code to multiply each value in a HashMap of Integer values by 2 using replaceAll() method.

public class HashMapAssignement9 {
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
		
		hm1.put(null, 20);
		hm1.put(2,30);
		hm1.put(3, 15);
		hm1.put(4, 7);
		hm1.put(5, 10);
		hm1.put(6, 100);
		
		System.out.println("The hashmap is : "+hm1);
		
		hm1.replaceAll((key,value)->value*2);
		
		System.out.println("The hashmap after performing opeartion on values of hashmap is : "+hm1);

		/*for(Integer i:hm1.keySet())
		{
			hm1.replace(i, hm1.get(i)*2);
		}
		System.out.println("The hashmap is : "+hm1);
		*/



	

		
		
	}

}
