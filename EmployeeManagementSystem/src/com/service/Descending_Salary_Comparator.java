package com.service;

import java.util.Comparator;

import com.entity.Employee;

public class Descending_Salary_Comparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getSalary()<e2.getSalary())
		{
			return 1;
		}
		else if(e1.getSalary()>e2.getSalary())
		{
			return -1;
		}
		
		return 0;
	}

}
