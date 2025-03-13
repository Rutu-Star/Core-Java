package com.service;
import com.entity.Employee;
import java.util.Comparator;

public class Employee_ID_Comparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getId()-o2.getId();
	}

}
