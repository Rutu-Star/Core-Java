package com.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

//Iterate over all elements in an ArrayList using a loop.

public class ArrayListAssignment18 {
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println("The arraylist is :"+a1);
		
		System.out.println("\nThe arraylist is iterate by for-each loop :");
		
		for(Object obj:a1)
		{
			System.out.println(obj);
		}
		
		System.out.println("\nThe arraylist is iterate by for-each loop :");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("\nThe arraylist is iterate by for-each lambda function loop :");

		a1.forEach((i)->System.out.println(i));
		
		System.out.println("\nThe arraylist is iterate by iterator :");
		
		Iterator i=a1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("\nThe arraylist is iterate by listiterator :");

		Iterator l=a1.listIterator(0);
		while(l.hasNext())
		{
			System.out.println(l.next());
		}

	}

}
