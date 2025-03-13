package com.collection.list.arraylist;
import java.util.ArrayList;

//Copy all elements from one ArrayList to another.

public class ArrayListAssignment12 {
	
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(10);
		a1.add(2);
		a1.add(3);
		a1.add(300);
		a1.add(11);
		a1.add(89);
		a1.add(4);
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("Rutuja");
		a2.add("Komal");
		a2.add("Lila");
		a2.add("Katalyst");
		a2.add("Sandhya");
		a2.add("Nikita");
		a2.add("Pranoti");
		
		System.out.println("The first arraylist is :"+a1);
		System.out.println("The second arraylist is :"+a2);
		
		a1.addAll(a2);
		System.out.println("After copying elements :"+a1);


	}

}
