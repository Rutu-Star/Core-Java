package employeeSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class EmployeeSystemImp implements EmployeeSystem {

	String url="jdbc:mysql://localhost:3306/schooldb";
	String user="Rutu";
	String password="Rutu@123";
	Connection con;
	
	public EmployeeSystemImp() throws SQLException {
		
		con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection Establish Successfully !! ");
	}
	@Override
	public void createdatabse() throws SQLException {
		
		// TODO Auto-generated method stub
		String query1="create database if not exists Employeedb ";
		String query2="use  Employeedb";
		String query3="create table if not exists Employees(id int primary key,name varchar(20),department varchar(20),salary double)";
		Statement st=null;
		try {
			
			st=con.createStatement();
			st.execute(query1);
			System.out.println("Employeedb Database created successfully !!");
			st.execute(query2);
			st.execute(query3);
			System.out.println("Employees Table created successfully !!");
		}
		catch(Exception e)
		{
			
		}
		st.close();
		
		
	}
	@Override
	public void addEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
		String query="insert into Employees(id,name,department,salary) values(?,?,?,?)";
		
		PreparedStatement per=null;
		try
		{
			per=con.prepareStatement(query);
			
			per.setInt(1, employee.getId());
			per.setString(2, employee.getName());
			per.setString(3, employee.getDepartment() );
			per.setDouble(4, employee.getSalary());
			
			per.executeUpdate();
			
			System.out.println("Employee added Successfully !!");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		per.close();
		
	}
	@Override
	public List<Employee> viewEmployee() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Employee Information : ");
		List<Employee> employee=new ArrayList<Employee>();
		
		String query="Select * from Employees";
		Statement  st=null;
		ResultSet rs=null;
		
		try {
			
			st=con.createStatement();
			
			rs=st.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String department=rs.getString(3);
				double salary=rs.getDouble(4);
				
				employee.add(new Employee(id,name,department,salary));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		st.close();
		return employee;
	}
	
	@Override
	public boolean removeEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
	
		String query="delete from Employees where id=?";
		PreparedStatement per=null;
		
		try
		{
			per=con.prepareStatement(query);
			per.setInt(1, id);
			
			per.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			
		}
		per.close();
		return false;
	}
	@Override
	public boolean updateEmployee(String department ) throws SQLException {
		// TODO Auto-generated method stub
		
		String query="update Employees set salary=salary+10000 where department=?";
		
		PreparedStatement per=null;
		
		try
		{
			per=con.prepareStatement(query);
			
			per.setString(1, department);
			int rowupdated =per.executeUpdate();
			
			
			return rowupdated>0;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		per.close();
		return false;
	}

}
