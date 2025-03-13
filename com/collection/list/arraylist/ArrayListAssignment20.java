package com.collection.list.arraylist;
//Convert an ArrayList of integers to a set to remove duplicates.

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class ArrayListAssignment20 {
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(20);
		a1.add(30);
		a1.add(60);
		a1.add(70);
		System.out.println("The ArrayList is :"+a1);

		
		Set s1=new TreeSet(a1);
		
		System.out.println("The set is : "+s1);
		
		
		/*
		Set s1=new TreeSet();
		
		for(Object obj:a1)
		{
			s1.add(obj);
		}
		System.out.println("The set is : "+s1);
		*/
		

		
	}

}
