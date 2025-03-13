package com.sql_Connection_Demo1;

//import java.util.Scanner;
import java.util.Scanner;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyMainClass {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/CompanyDB";
		String user = "Rutu";
		String pass = "Rutu@123";

		Connection con = DriverManager.getConnection(url, user, pass);

		System.out.println("Mysql Connection establish successfully ... ! ");

		String query1 = "create database if not exists EmployeeDatabase";
		String query2 = "use EmployeeDatabase";
		String query3 = "Create table if not exists EmployeeData(ID int primary key,Name varchar(20),Age int,Salary Decimal(10,2))";
		String query4 = "Insert into EmployeeData values(?,?,?,?)";

		Statement stm = con.createStatement();
		stm.execute(query1);
		System.out.println("Query1 run successfully ... ! ");

		stm.execute(query2);
		System.out.println("Query2 run successfully ... ! ");

		stm.execute(query3);
		System.out.println("Query3 run successfully ... ! ");
		
		
		//insert data into table
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the ID of Employee :  ");
		int id=sc.nextInt();
		
		System.out.println("\nEnter the Name of Employee :  ");
		String Name=sc.next();
		
		System.out.println("\nEnter the Age of Employee :  ");
		int age=sc.nextInt();
		
		System.out.println("\nEnter the Salary of Employee :  ");
		int salary=sc.nextInt();
		
		PreparedStatement per=con.prepareStatement(query4);
		
		per.setInt(1,id);
		per.setString(2, Name);
		per.setInt(3, age);
		per.setInt(4, salary);
		
		per.executeUpdate();
		System.out.println("Query4 data inserted successfully ... ! \n");
		
		System.out.println("The Employee Data :  \n");

		String query5="Select * from EmployeeData";
		
		ResultSet rs=stm.executeQuery(query5);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		System.out.println("Query5 data retrive  successfully ... ! ");
		
		rs.close();
		con.close();
		sc.close();

		
	
	}
}
