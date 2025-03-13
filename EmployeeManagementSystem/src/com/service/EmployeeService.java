package com.service;
import com.dao.EmployeeDao;
import java.util.Scanner;
import java.util.Iterator;
import com.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeService {
	EmployeeDao ed=new EmployeeDao();
	
	//1.Fetching all employee 
	public ArrayList<Employee> allEmployee()
	{
		System.out.println("The all Employee details: ");

		for(Employee e:ed.allEmployee())
		{
			System.out.println(e);
		}
		return ed.allEmployee();
	}
	
	//2.Fetching All developers 
	public ArrayList<Employee> allDevlopers()
	{
		System.out.println("The deatils of all Developers : ");
		for(Employee e:ed.allEmployee())
		{
			if(e.getDepartment().equalsIgnoreCase("Developer"))
			{
				System.out.println(e);
		
			}
		}
		return ed.allEmployee();
	}
	
	//3.All Employee by ascending id 
	
	public ArrayList<Employee> allEmployeebyAscendingID()
	{
		System.out.println("The Employee by ascending order by id : ");

		ArrayList<Employee> empAScID=new ArrayList<>();
		
		empAScID.addAll(ed.allEmployee());
		
		
		//by using  Comparator  
		/*
		Collections.sort(empAScID, new Employee_ID_Comparator());;
		
		//Iterate each employee by ascending order by id 

		for(Employee e:empAScID)
		{
			System.out.println(e);
			
		}
		*/
		
		//by using  sorting 
		
		
		for(int i=0;i<empAScID.size();i++)
		{
			for(int j=i+1;j<empAScID.size();j++)
			{
				if(empAScID.get(i).getId()>empAScID.get(j).getId())
				{
					int temp=empAScID.get(i).getId();
					empAScID.get(i).setId(empAScID.get(j).getId());
					empAScID.get(j).setId(temp);
				}
			}
		}
		
		System.out.println("The Employee details by ascending ID : ");
		//Iterate each employee by ascending order by id 
		for(Employee e:empAScID)
		{
			System.out.println(e);
		}
		
		return empAScID;
	}
	
	
	//4.Employee having highest salary
	public double highestSalary()
	{
		double highSalary=Double.MIN_VALUE;
		for(Employee e:ed.allEmployee())
		{
			if(e.getSalary()>highSalary)
			{
				highSalary=e.getSalary();
			}
			
		}
		
		//print highest salary employee
		for(Employee e:ed.allEmployee())
		{
			if(highSalary==e.getSalary())
			{
				System.out.println("The highest salary is : "+highSalary);
				System.out.println("The Employee having highest salary is :"+e);
			}
		}
		return highSalary;
	}
	
	//5.Employee having lowest salary
	public double lowestSalary()
	{
		double lowestSalary=Double.MAX_VALUE;
		for(Employee e:ed.allEmployee())
		{
			if(e.getSalary()<lowestSalary)
			{
				lowestSalary=e.getSalary();
			}
		}
		
		//print lowest salary employee
		for(Employee e:ed.allEmployee())
		{
			if(lowestSalary==e.getSalary())
			{
				System.out.println("The lowest salary is : "+lowestSalary);
				System.out.println("The Employee having lowest salary is :"+e);
			}
		}
		return lowestSalary;
	}
	
	//6.All Employee by descending name
	public ArrayList<Employee> allEmployeeByDescendingName()
	{
		System.out.println("The all Employee by descending order by name: ");

		ArrayList<Employee> empDescName=new ArrayList<>();
		empDescName.addAll(ed.allEmployee());

		//sort arraytlist by descending name order ignore case of name use string method
		for(int i=0;i<empDescName.size();i++)
		{
			for(int j=i+1;j<empDescName.size();j++)
			{
				int result =empDescName.get(i).getName().compareToIgnoreCase(empDescName.get(j).getName());
				if(result<0)
				{
					String temp=empDescName.get(i).getName();
					String a=empDescName.get(j).getName();
					empDescName.get(i).setName(a);
					empDescName.get(j).setName(temp);
				}
			}
		}
		
		//iterate all employee 
		System.out.println("The all employee by descending name is : ");
		for(Employee e:empDescName)
		{
			System.out.println(e);
		}
		
		
		
		/*
		//by using comparator
		Collections.sort(empDescName, new NameComparatorDecs());
		//iterate all employee 
			System.out.println("The all employee by descending name is : ");
			for(Employee e:empDescName)
			{
				System.out.println(e);
			}
	
		*/
		return empDescName;
	}
	
	//7.Increase salary of tester by 28%
	public ArrayList<Employee> increaseSalaryOfTester()
	{
		System.out.println("The Salary increse by 28% of tester !");
		ArrayList<Employee> Incr_Sala_Tester=new ArrayList<>();
		Incr_Sala_Tester.addAll(ed.allEmployee());
		
		
		for(Employee e:Incr_Sala_Tester)
		{
			
			if(e.getDepartment()=="Tester")
			{
				System.out.println("\nThe tester : "+e);
				System.out.println("The old salary : "+e.getSalary());

				double Curr_Salary=e.getSalary();
				e.setSalary(Curr_Salary+Curr_Salary*0.28);
				System.out.println("The updated salary : "+e.getSalary());

			}
		}
		
		return Incr_Sala_Tester;
	}
	
	//8.Employee name starts with user input
	public ArrayList<Employee> employeeNameStart_UI()
	{
		System.out.println("Find employee by user input by name : ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter the Employee name to find details : ");
		String emp_name=sc.nextLine();
		
		boolean flag=false;
		for(Employee e:ed.allEmployee())
		{
			if(e.getName().equals(emp_name))
			{
				System.out.println(e);
				flag=true;
			}
		}
		
		if(!flag)
		{
			System.out.println("The given name don't have any match ");
		}
		return ed.allEmployee();
	}
	
	//9.Employee name ends with user input
	public ArrayList<Employee> employeeNameEnd_UI()
	{
		return ed.allEmployee();
	}
	
	//10.Only name of CEO
	
	public String NameOfCEO()
	{
		String ceo_name=null;
		for(Employee e:ed.allEmployee())
		{
			if(e.getDepartment()=="CEO")
			{
				ceo_name=e.getName();
				System.out.println("The name of CEO is : "+ceo_name);
			}
		}
		return ceo_name;
	}
	
	//11.All Employee by descending salary
	public ArrayList<Employee> allEmployeeByDescendingSalary()
	{
		System.out.println("The Employee by descending salaray ! \n");
		
		
		ArrayList<Employee> DescSalary=new ArrayList<>();
		DescSalary.addAll(ed.allEmployee());
		
		for(int i=0;i<DescSalary.size();i++)
		{
			for(int j=i+1;j<DescSalary.size();j++)
			{
				if(DescSalary.get(i).getSalary()<DescSalary.get(j).getSalary())
				{
					double temp=DescSalary.get(i).getSalary();
					double a=DescSalary.get(j).getSalary();
					DescSalary.get(i).setSalary(a);
					DescSalary.get(j).setSalary(temp);
				}
			}
		}
		
		//iterate all employee by salary descending order
		for(Employee e:DescSalary)
		{
			System.out.println(e);
		}
		
		/*
		//by Descending_Salary_Comparator
		Collections.sort(DescSalary,new Descending_Salary_Comparator());
		//iterate all employee by salary descending order
		for(Employee e:DescSalary)
		{
			System.out.println(e);
		}
		
		*/
		return DescSalary;
	}
	
	//12.Employee hired in_or_after user input month
	public ArrayList<Employee> employeeHiredMonth_UI()
	{
		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the month in number format like 01,02,03... : ");
		String User_month=sc.nextLine();

		System.out.println("The employee hired from "+User_month+"th month");
		for(Employee e:ed.allEmployee())
		{
			String emp_month=e.getHiring_date().substring(5,7);
			int result=emp_month.compareToIgnoreCase(User_month);
	
			if(result>=0)
			{
				System.out.println(e);
			}
		}
		
		
		return ed.allEmployee();
	}
	
	//13.Employee hired in_or_after user input year
	public ArrayList<Employee> employeeHiredYear_UI()
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the year in number format like 2021, 2022... : ");
		String User_year=sc.nextLine();

		System.out.println("The employee hired from "+User_year+" year");
		for(Employee e:ed.allEmployee())
		{
			String emp_year=e.getHiring_date().substring(0,4);
			int result=emp_year.compareToIgnoreCase(User_year);
	
			if(result>=0)
			{
				System.out.println(e);
			}
		}
		
		return ed.allEmployee();
	}
	
	
	
	

}
