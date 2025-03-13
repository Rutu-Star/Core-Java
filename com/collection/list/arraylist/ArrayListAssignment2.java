package com.collection.list.arraylist;
//Remove an element from a specific position in an ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssignment2 {
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println("The arraylist is : "+a1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index for remove element : ");
		int index=sc.nextInt();
		
		a1.remove(index);
		
		System.out.println("The arraylist after removing element  is : "+a1);

	}

}
