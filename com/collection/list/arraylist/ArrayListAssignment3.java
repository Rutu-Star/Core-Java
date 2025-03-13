package com.collection.list.arraylist;
//Find the size of an ArrayList of strings after adding elements.

import java.util.ArrayList;

public class ArrayListAssignment3 {
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
		System.out.println("The arrayList is :"+a1);
		System.out.println("The size of arrayList is :"+a1.size());

	}

}
