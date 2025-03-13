package com.collection.list.linklist;
import java.util.LinkedList;
//addFirst: Create a method to add a node at the beginning of a singly linked list.
public class LinkListAssignment1 {
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		
		l1.add(2);
		l1.add(25.0);
		l1.add(null);
		l1.add(true);
		l1.add(false);
		l1.add('a');
		l1.add("Rutu");
		l1.add(56);
		
		System.out.println("The linkedList is : "+l1);
		l1.addFirst(1);
		System.out.println("The linkedList is : "+l1);

	}

}
