package com.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Collections;

//Create an ArrayList of strings and reverse the order of elements.
public class ArrayListAssignment10 {
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Rutuja");
		a1.add("Komal");
		a1.add("Lila");
		a1.add("Katalyst");
		a1.add("Sandhya");
		a1.add("Nikita");
		a1.add("Pranoti");

		System.out.println("The arraylist is :");
		System.out.println(a1);
		System.out.println("After reversing the arraylist is :");

		Collections.reverse(a1);
		System.out.println(a1);

		/*for(int i=a1.size()-1;i>=0;i--)
		{
			System.out.print(a1.get(i)+", ");
		}
		*/
	
	}


}
