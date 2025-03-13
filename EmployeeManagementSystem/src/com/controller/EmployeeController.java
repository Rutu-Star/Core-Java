package com.controller;
import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.EmployeeService;
import java.util.ArrayList;

public class EmployeeController {
	
	EmployeeService es=new EmployeeService();
	
	//1.Fetching All Employee
	public ArrayList<Employee> allEmployee()
	{
		return es.allEmployee();
	}
	
	//2.Fetching All developers 
	public ArrayList<Employee> allDevlopers()
	{
		return es.allDevlopers();
	}
	
	//3.All Employee by ascending id 
	public ArrayList<Employee> allEmployeebyAscendingID()
	{
		return es.allEmployeebyAscendingID();
	}
	
	//4.Employee having highest salary
	public double highestSalary()
	{
		return es.highestSalary();
	}
	
	//5.Employee having lowest salary
	public double lowestSalary()
	{
		return es.lowestSalary();
	}
	
	//6.All Employee by descending name
	public ArrayList<Employee> allEmployeeByDescendingName()
	{
		return es.allEmployeeByDescendingName();
	}
	
	//7.Increase salary of tester by 28%
	public ArrayList<Employee> increaseSalaryOfTester()
	{
		return es.increaseSalaryOfTester();
	}
	
	//8.Employee name starts with user input
	public ArrayList<Employee> employeeNameStart_UI()
	{
		return es.employeeNameStart_UI();
	}
	
	//9.Employee name ends with user input
	public ArrayList<Employee> employeeNameEnd_UI()
	{
		return es.employeeNameEnd_UI();
	}
	
	//10.Only name of CEO
	public String NameOfCEO()
	{
		return es.NameOfCEO();
	}
	
	//11.All Employee by descending salary
	public ArrayList<Employee> allEmployeeByDescendingSalary()
	{
		return es.allEmployeeByDescendingSalary();
	}
	
	//12.Employee hired in_or_after user input month
	public ArrayList<Employee> employeeHiredMonth_UI()
	{
		return es.employeeHiredMonth_UI();
	}

	//13.Employee hired in_or_after user input year
	public ArrayList<Employee> employeeHiredYear_UI()
	{
		return es.employeeHiredYear_UI();
	}

}
