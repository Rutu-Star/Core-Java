package com.collection.list.arraylist;
import java.util.ArrayList;

//Remove duplicate elements from an ArrayList of strings.


public class ArrayListAssignment13 {
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
		
		for(int i=0;i<a1.size();i++)
		{
			for(int j=i+1;j<a1.size();j++)
			{
				if(a1.get(i).equals(a1.get(j)))
				{
					System.out.println(a1.remove(j));
	
				}
			}
		}
		
		System.out.println("After removing duplicates The arraylist is : "+a1);

		
		
	}

}
