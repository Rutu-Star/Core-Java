package com.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UserDefineComaprision {
	
	public static void main(String[] args)
	{
		ArrayList<Student> as1=new ArrayList<Student>();
		
		as1.add(new Student("Rutuja",19,104));
		as1.add(new Student("Sandhya",54,108));
		as1.add(new Student("Nikita",12,105));
		as1.add(new Student("Pranoti",25,107));
		as1.add(new Student("Komal",30,102));
		as1.add(new Student("Sayali",25,109));
		
		System.out.println(as1);
		
		System.out.println("\nSorting list by age parameter in descending order");
		Collections.sort(as1, new AgeComparator());
		System.out.println(as1);
		
		System.out.println("\nSorting list by id parameter in ascending order");
		Collections.sort(as1, new IdComparator());
		System.out.println(as1);
		
		System.out.println("\nSorting list by name parameter");
		Collections.sort(as1, new NameCoparator());
		System.out.println(as1);




		
		
	}

}
