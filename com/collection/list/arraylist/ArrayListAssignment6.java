package com.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

//Retrieve an element from a specific position in an ArrayList.

public class ArrayListAssignment6 {
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
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position from where you want to retrive the elelment from arraylist : ");
		int position=sc.nextInt();
		System.out.println("At "+position +" position the element is : "+a1.get(position));

		

		
	}

}
