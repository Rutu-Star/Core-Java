package com.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

//Check if an ArrayList contains a specific element

public class ArrayListAssignment4 {
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
		
		System.out.println("The arraylist is : "+a1);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to check present or not in arraylist : ");
		String element=sc.nextLine();
		
		if(a1.contains(element))
		{
			System.out.println(element+" is present in Arraylist !");
		}
		else
		{
			System.out.println(element+" is not present in Arraylist !");
		}

		
		//System.out.println(a1.contains("Rutuja"));
		
	}

}
