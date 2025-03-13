package com.collection.list.arraylist;
//Add an element at the beginning of an ArrayList.

import java.util.ArrayList;

public class ArrayListAssignment5 {
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Rutuja");
		a1.add("Komal");
		a1.add("Lila");
		a1.add("Lila");
		a1.add("Katalyst");
		
		a1.add("Sandhya");
		a1.add("Nikita");
		a1.add("Pranoti");
		a1.add("Rutuja");
		
		System.out.println("The arraylist is :"+a1);
		
		a1.add(0, "Abc");
		System.out.println("The arraylist after adding element at beging is :"+a1);

	}
	

}
