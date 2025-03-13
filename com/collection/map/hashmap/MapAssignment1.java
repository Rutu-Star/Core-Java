package com.collection.map.hashmap;
import java.util.TreeMap;
import java.util.Map;

//Create two maps with some common keys and some unique keys.
//Write code to merge both maps, where common keys add up their values.
public class MapAssignment1 {
	public static void main(String[] args)
	{
		Map m1=new TreeMap();
		
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		m1.put(4, "D");
		m1.put(5, "E");
		
		Map m2=new TreeMap();
		
		m2.put(1, "A");
		m2.put(2, "B");
		m2.put(6, "C");
		m2.put(7, "D");
		m2.put(8, "E");
		
		System.out.println("The Map1 :"+m1);
		System.out.println("The Map2 :"+m2);
		
		m1.putAll(m2);
		System.out.println("After merging m2 to m1 :"+m1);


		

		
	}

}
