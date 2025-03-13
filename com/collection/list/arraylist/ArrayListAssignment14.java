package com.collection.list.arraylist;
import java.util.ArrayList;

//Convert an ArrayList of strings to an array.

public class ArrayListAssignment14 {
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Rutuja");
		a1.add("Komal");
		a1.add("Lila");
		a1.add("Lila");
		a1.add("Katalyst");
		a1.add("Katalyst");
		a1.add("Sandhya");
		a1.add("Nikita");
		a1.add("Pranoti");
		a1.add("Rutuja");

		
		System.out.println("The arraylist is : "+a1);
		
		Object array[]=a1.toArray();
		
		System.out.println("The array of string arraylist  is : ");
		for(Object obj: array)
		{
			System.out.print(obj+" ");

		}

	}

}
