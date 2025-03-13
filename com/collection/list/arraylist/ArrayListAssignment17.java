package com.collection.list.arraylist;
import java.util.ArrayList;
//Check if two ArrayLists are equal.

public class ArrayListAssignment17 {
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		a3.add(40);
		a3.add(50);
		
		ArrayList<String> a4=new ArrayList<String>();
		a4.add("10");
		a4.add("20");
		a4.add("30");
		a4.add("40");
		a4.add("50");
		
		System.out.println("The first arrayList is :"+a1);
		System.out.println("The second arrayList is :"+a2);
		
		if(a1.equals(a2))
		{
			System.out.println("The two arraylist are equals !");
		}
		else
		{
			System.out.println("The two arraylist are not equals !");
		}
		
		System.out.println();
		System.out.println("The first arrayList is :"+a3);
		System.out.println("The second arrayList is :"+a4);
		if(a3.equals(a4))
		{
			System.out.println("The two arraylist are equals !");
		}
		else
		{
			System.out.println("The two arraylist are not equals !");
		}



	}

}
