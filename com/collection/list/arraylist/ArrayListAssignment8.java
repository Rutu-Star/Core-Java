package com.collection.list.arraylist;
//Sort an ArrayList of integers in ascending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListAssignment8 {
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(20);
		a1.add(30);
		a1.add(60);
		a1.add(10);
		a1.add(70);
		System.out.println("The ArrayList is :"+a1);
		
		Collections.sort(a1);
		System.out.println("After sorting The ArrayList is :"+a1);
		
		/*
		for(int i=0;i<a1.size();i++)
		{
			for(int j=i;j<a1.size();j++)
			{
				if(a1.get(i)>a1.get(j))
				{
					Integer temp=a1.get(i);
					a1.set(i, a1.get(j));
					a1.set(j, temp);
				}
			}
		}
		
		System.out.println("After sorting The ArrayList is :"+a1);
		 */

	}
	

}
