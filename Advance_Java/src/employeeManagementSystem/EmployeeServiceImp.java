package employeeManagementSystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class EmployeeServiceImp implements  EmployeeService{

	Connection con;
	public EmployeeServiceImp() throws SQLException
	{
		DatabaseConnectivity db=new DatabaseConnectivity();
		con=DriverManager.getConnection(db.url, db.user, db.password);
	}
	
	public void createDB_Tables() throws SQLException
	{
		String query1="create database if not exists EmployeeSystem";
		String query2="use EmployeeSystem";
		String query3="create table if not exists Employees(id int primary key,"
				+ "name varchar(20),role varchar(20),salary double)";
	
		String query4="create table if not exists Admins(name Varchar(20),"
				+ "email varchar(20) primary key,password varchar(20))";
		
		String query5="insert into Admins(name,email,password) values(?,?,?)";
		
		Statement st=null;
		PreparedStatement per=null;
		try {
			
			st=con.createStatement();
			
			st.execute(query1);
			System.out.println("Database created successfully !!! ");
			st.execute(query2);
			st.execute(query3);
			System.out.println("Table created successfully !!! ");
			st.execute(query4);
			System.out.println("Table created successfully !!! ");
			
			per=con.prepareStatement(query5);
			
			per.setString(1, "Rutu");
			per.setString(2, "rutu1234@gmail.com");
			per.setString(3, "Rutu@123");
			
			per.executeUpdate();
			System.out.println("Admin add successfully !! ");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		st.close();
		
		
	}
	
	@Override
	public void addEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		String query="insert into Employees(id,name,role,salary) values(?,?,?,?)";
		
		
		PreparedStatement per=null;
		
		try
		{
	
			per=con.prepareStatement(query);
			
			per.setInt(1, employee.getId());
			per.setString(2,employee.getName());
			per.setString(3, employee.getRole());
			per.setDouble(4, employee.getSalary());
			
			per.executeUpdate();
			System.out.println("Employee added successfully !!! ");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		per.close();
		
	}

	@Override
	public List<Employee> fetchEmployee() throws SQLException {
		// TODO Auto-generated method stub
		
		String query="select * from Employees";
		Statement st=null;
		ResultSet rs=null;
		List<Employee> employee=new ArrayList<Employee>();
		try {
			
			st=con.createStatement();
			rs=st.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String role=rs.getString(3);
				double salary=rs.getDouble(4);
				
				employee.add(new Employee(id,name,role,salary));
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
	public boolean updateEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		
		String query="update Employees set role='Developer' where id=?";
		PreparedStatement per=null;
		
		try
		{
			per=con.prepareStatement(query);
			per.setInt(1,id);
			int result=per.executeUpdate();
			
			return result>0;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		per.close();
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query="delete from Employees where id=?";
		PreparedStatement per=null;
		
		try
		{
			per=con.prepareStatement(query);
			per.setInt(1, id);
			int result=per.executeUpdate();
			
			return result>0;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		per.close();
		return false;
	}

	@Override
	public void addAdmin(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		String query="insert into Admins(name,email,password) values(?,?,?)";
		
		PreparedStatement per=null;
		
		try
		{
			per=con.prepareStatement(query);
			per.setString(1, admin.getName());
			per.setString(2, admin.getEmail());
			per.setString(3, admin.getPassword());
			per.executeUpdate();
			System.out.println("Admin added successfully !!! ");
			
		}
		catch(Exception  e)
		{
			System.out.println(e.getMessage());
		}
		
		per.close();
		
	}

	@Override
	public List<Admin> fetchAdmin()     
	{
		// TODO Auto-generated method stub
		String query="select *  from Admins";
		
		List<Admin> admin=new ArrayList<Admin>();
		Statement st=null;
		ResultSet rs=null;
		
		try
		{
			st=con.createStatement();
			rs=st.executeQuery(query);
			
			while(rs.next())
			{
				String name =rs.getString(1);
				String email=rs.getString(2);
				String password=rs.getString(3);
				
				admin.add(new Admin(name,email,password));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	
		return admin;
	}


}
