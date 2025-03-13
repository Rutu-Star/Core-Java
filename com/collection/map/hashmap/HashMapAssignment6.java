package com.collection.map.hashmap;
import java.util.HashMap;
//Try retrieving a value that doesn't exist and see what the output is.
public class HashMapAssignment6 {
	public static void main(String[] args)
	{
		HashMap<Integer, Float> hm1=new HashMap<Integer, Float>();
		
		hm1.put(null, (float) 25.5);
		hm1.put(2, (float) 35);
		hm1.put(3, (float) 2.5);
		hm1.put(1, (float) 40.25);
		hm1.put(4, (float) 12.87);
		hm1.put(5, (float) 10);
		
		System.out.println("The hashmap is : "+hm1);
		System.out.println(hm1.get(9));
	



	}

}
