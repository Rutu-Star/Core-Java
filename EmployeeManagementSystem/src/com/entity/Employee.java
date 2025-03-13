package com.entity;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String hiring_date;
	private String department;
	
	
	public Employee(int id,String name,String department ,double salary, String hiring_date)
	{
		super();
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
		this.hiring_date=hiring_date;
		
	}
	
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", hiring_date=" + hiring_date
				+ ", department=" + department + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getHiring_date() {
		return hiring_date;
	}

	public void setHiring_date(String hiring_date) {
		this.hiring_date = hiring_date;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
	

}
