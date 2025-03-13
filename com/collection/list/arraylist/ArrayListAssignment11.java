package com.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Collections;

//Find the maximum and minimum values in an ArrayList of integers.
public class ArrayListAssignment11 {
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(100);
		a1.add(10);
		a1.add(2);
		a1.add(3);
		a1.add(300);
		a1.add(11);
		a1.add(89);
		a1.add(4);
		System.out.println(a1);
		System.out.println("The max value in arraylist :"+Collections.max(a1));
		System.out.println("The min value in arraylist :"+Collections.min(a1));
		

		/*Integer max=a1.get(0);
		for(Integer i:a1)
		{
			if(i>max)
			{
				max=i;
			}
		}
		System.out.println("The max value in arraylist :"+max);
		
		Integer min=a1.get(0);
		for(Integer i:a1)
		{
			if(i<min)
			{
				min=i;
			}
		}
		System.out.println("The min value in arraylist :"+min);

		*/

	
	}


}
