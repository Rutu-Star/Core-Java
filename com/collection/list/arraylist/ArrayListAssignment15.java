package com.collection.list.arraylist;
import java.util.ArrayList;
import java.util.LinkedList;

//Convert an ArrayList to a LinkedList and display both.

import java.util.ArrayList;

public class ArrayListAssignment15 {
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
		
		
		
		LinkedList l1=new LinkedList(a1);
		System.out.println("The arraylist is : "+a1);

		System.out.println("The linkedlist is : "+l1);
		
		
		System.out.println("The arraylist is : "+a1.clone());

	}

}
