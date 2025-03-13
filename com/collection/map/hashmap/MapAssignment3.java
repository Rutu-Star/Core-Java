package com.collection.map.hashmap;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

//Write a program that adds a default value if a certain key is missing in the map.

public class MapAssignment3 {
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
		m1.putIfAbsent(null, null);
		System.out.println("The Hahsmap is :"+m1);	

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the key for hashmap :");
		int key=sc.nextInt();
		
		m1.putIfAbsent(Integer.valueOf(key), null);

		System.out.println("The Hahsmap after adding default value is :"+m1);	

		
		
	}

}
