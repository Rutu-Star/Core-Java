package com.collection.map.hashmap;
import java.util.HashMap;
import java.util.Scanner;
//Check if the HashMap from the previous assignment contains a specific name and a specific age.
//Print appropriate messages based on whether the key or value exists.

public class HashMapAssignment7 {
	public static void main(String[] args)
	{
		HashMap<String , Integer> hm1=new HashMap<String, Integer>();
		
		hm1.put("Rutuja",20);
		hm1.put("Sandhya",22);
		hm1.put("Komal",25);
		hm1.put("Sayali",24);
		hm1.put("Akansha",18);
		hm1.put("Rucha",15);
		hm1.put("Nikita",14);
		hm1.put("Pranoti",30);
		
		System.out.println("The hashmap with Name(key) and Age(value)  is : "+hm1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name to check the presence of name in hahsmap");
		String name=sc.nextLine();
		
		if(hm1.containsKey(name))
		{
			System.out.println(name+" is present in hashmap");
		}
		else
		{
			System.out.println(name+" is not present in hashmap");

		}
		
		System.out.println("Enter the age to check the presence of age in hahsmap");
		int age=sc.nextInt();
		
		if(hm1.containsValue(Integer.valueOf(age)))
		{
			System.out.println(age+" is present in hashmap");
		}
		else
		{
			System.out.println(age+" is not present in hashmap");

		}



	}

}
