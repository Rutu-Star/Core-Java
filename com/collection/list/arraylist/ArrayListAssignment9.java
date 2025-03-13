package com.collection.list.arraylist;
import java.util.ArrayList;
//Sort an ArrayList of integers in descending order.
import java.util.Collections;
import java.util.Comparator;
public class ArrayListAssignment9 {
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
		
		
		a1.sort(Comparator.reverseOrder());
		System.out.println("After sorting The ArrayList is :"+a1);
		
		//Collections.sort(a1, new ElementCompatator());	
		//System.out.println("After sorting The ArrayList is :"+a1);

		

		/*for(int i=0;i<a1.size();i++)
		{
			for(int j=i;j<a1.size();j++)
			{
				if(a1.get(i)<a1.get(j))
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
