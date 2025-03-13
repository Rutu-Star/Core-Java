package com.service;
import com.entity.Employee;
import java.util.Comparator;
public class NameComparatorDecs implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getName().compareToIgnoreCase(e2.getName())<0)
		{
			return 1;
		}
		else if(e1.getName().compareToIgnoreCase(e2.getName())>0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
	
	

}
