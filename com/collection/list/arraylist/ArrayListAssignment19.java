package com.collection.list.arraylist;
import java.util.ArrayList;
//Clear all elements from an ArrayList and check if it's empty.


public class ArrayListAssignment19 {
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println("The arraylist is : "+a1);
		
		a1.clear();
		System.out.println("The arraylist is : "+a1);

	}
	

}
