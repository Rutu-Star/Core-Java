package com.collection.list.arraylist;

import java.util.Comparator;

public class ElementCompatator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		
		return b-a;
		
		/*if(a==b)
			return 0;
		else if(a<b)
			return 1;
		else
			return -1;
			
			*/
	}

}
