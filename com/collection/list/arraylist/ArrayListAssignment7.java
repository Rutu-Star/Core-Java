package com.collection.list.arraylist;
//Replace an element in an ArrayList at a given index.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssignment7 {
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
		
		System.out.println("The arraylist is : \n"+a1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the position and element to replace from arraylist : "+a1);
		int position=sc.nextInt();
		String element=sc.nextLine();
		a1.set(position, element);
		System.out.println("\nAfter replacing "+position+" position with "+element+" the arraylist is : \n"+a1);

	}

}
