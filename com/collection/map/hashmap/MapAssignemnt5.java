package com.collection.map.hashmap;
import java.util.HashMap;
import java.util.TreeSet;

//Create a map where each key is a category (e.g., fruit, vegetable) and each value is a set of items in that category. Add and display entries in the map.

public class MapAssignemnt5 {
	public static void main(String[] args)
	{
		TreeSet s1=new TreeSet();
		
		s1.add("Black");
		s1.add("While");
		s1.add("purple");
		s1.add("Orange");
		s1.add("Pink");
		
		TreeSet s2=new TreeSet();
		
		s2.add("Mango");
		s2.add("Strawberry");
		s2.add("Orange");
		s2.add("Cherry");
		s2.add("Apple");
		
		TreeSet s3=new TreeSet();
		
		s3.add("potato");
		s3.add("Spinach");
		s3.add("Broccoli");
		s3.add("Carrot");
		s3.add("Cauliflower");
		
		TreeSet s4=new TreeSet();
		
		s4.add("Rose");
		s4.add("Lily");
		s4.add("Tulip");
		s4.add("Marigold");
		s4.add("Sunflower");
		
		HashMap<String,Object> hm1=new HashMap<String,Object>();
		
		hm1.put("Color", s1);
		hm1.put("Fruits", s2);
		hm1.put("Vegetable", s3);
		hm1.put("Flower", s4);
		
		System.out.println(hm1.entrySet());

		
		

		
	}

}
