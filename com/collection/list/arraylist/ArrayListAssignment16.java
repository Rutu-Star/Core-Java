package com.collection.list.arraylist;
import java.util.ArrayList;
//Clone an ArrayList and display the cloned list.


public class ArrayListAssignment16 {
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
		System.out.println("The arrayList is :"+a1);
		
		
		
		ArrayList<String> c1=(ArrayList<String>) a1.clone();
		
		System.out.println("The cloneList is :"+c1);

		/*
		ArrayList<String> c2=new ArrayList<>();
		
		for(String obj:a1)
		{
			c2.add(obj);
		}
		
		System.out.println("The cloneList is :"+c2);
       */

		
		
	}
	
		

}
