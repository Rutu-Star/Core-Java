package employeeManagementSystem;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSystemMainClass {
	 EmployeeServiceImp em=new EmployeeServiceImp();
	 
	
	EmployeeSystemMainClass() throws SQLException
	{
		em.createDB_Tables();
	}
	
	
	static  Scanner sc=new Scanner(System.in);
	
	//Autherization check 
	
	public boolean IsAdminExist()
	{
		List<Admin> admin=new ArrayList<Admin>();
		
	     admin=em.fetchAdmin();
	     
	     Map<String,String> adminList=new HashMap<>();
	     
	     for(Admin a:admin)
	     {
	    	 adminList.put(a.getEmail(), a.getPassword());
	     }
	     
	     
	     System.out.println("Enter the admin username : ");
	     String email=sc.nextLine();
	     
	     System.out.println("Enter the admin password : ");
	     String password=sc.nextLine();
	     
		return adminList.containsKey(email) && adminList.get(email).equals(password);
	}

	//taking input from add employee
	
	public void AddEmployee() throws SQLException
	{
		if(IsAdminExist())
		{
		System.out.println("Enter the Employee details ID, Name, Role, Salary");
		
		int id=sc.nextInt();
		sc.nextLine();
		
		String name=sc.nextLine();
		
		
		String role=sc.nextLine();
		
		
		double salary=sc.nextDouble();
		sc.nextLine();
		
		Employee emp=new Employee(id,name,role,salary);
		
		em.addEmployee(emp);
		}
		else
		{
			System.out.println("Invalid user or password !! ");
		}
	}
		
	
	public  void Fetchemployee() throws SQLException
	{
		if(IsAdminExist())
		{
		
		List<Employee> employee=new ArrayList<Employee>();
		employee=em.fetchEmployee();
		System.out.println("\nThe All Employee details are : \n");
		for(Employee e:employee)
		{
			System.out.println(e);
		}
		}
		else
		{
			System.out.println("Invalid user or password !! ");
		}
		
	}
	
	public  void UpdateEmployee() throws SQLException
	{
		if(IsAdminExist())
		{
			
		
		System.out.println("Enter the id for employee : ");
		
		int id=sc.nextInt();
		sc.nextLine();
		
	
		if(em.updateEmployee(id))
		{
			System.out.println("Employee updated successfully !! ");
		}
		else
		{
			System.out.println("Employee updated successfully !! ");
		}
		}
		else
		{
			System.out.println("Invalid user or password !! ");

		}
		
	}
	
	public  void DeleteEmployee() throws SQLException 
	{
		if(IsAdminExist())
		{
			
		
		System.out.println("Enter the id for employee : ");
		
		int id=sc.nextInt();
		sc.nextLine();
		
		if(em.deleteEmployee(id))
		{
			System.out.println("\nEmployee deleted successfully !!! \n");
		}
		else
		{
			System.out.println("\nEmployee deleted successfully !!! \n");
		}
		}
		else
		{
			System.out.println("Invalid user or password !! ");

		}
	
		
	}
	
	public  void FetchAdmin()  
	{
		if(IsAdminExist())
		{
      List<Admin> admin=new ArrayList<Admin>();
		
      admin=em.fetchAdmin();
		
		//admin=employee.fetchAdmin();
		
		System.out.println("\nAll Admins are : \n");

		for(Admin a:admin)
		{
			System.out.println(a);
		}
		}
		else
		{
			System.out.println("Invalid user or password !! ");

		}
	}
	
	
	public static void main(String[] args) throws SQLException {
		
	
		EmployeeSystemMainClass system=new EmployeeSystemMainClass();
	
		
		/*
		//Add employee
		employee.addEmployee(new Employee(1,"Sanem","Engineer",40000));
		employee.addEmployee(new Employee(2,"Jan","CEO",1000000));
		employee.addEmployee(new Employee(3,"Lailla","Tester",50000));
		employee.addEmployee(new Employee(4,"Embre","Devloper",80000));
		employee.addEmployee(new Employee(5,"Sam","Tester",50000));
		
		//fetch employee
		List<Employee> emp=new ArrayList<Employee>();
		
		emp=employee.fetchEmployee();
		
		
		System.out.println("\nAll Employee are : \n");
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
		//update the employee
		if(employee.updateEmployee(1))
		{
			System.out.println("\nEmployee updated successfully !!! \n");
		}
		else
		{
			System.out.println("\nEmployee not updated  !!! \n");
		}
		
		
		//delete employee
		if(employee.deleteEmployee(5))
		{
			System.out.println("\nEmployee deleted successfully !!! \n");
		}
		else
		{
			System.out.println("\nEmployee deleted successfully !!! \n");
		}
		
		//fetch admin
		
		List<Admin> admin=new ArrayList<Admin>();
		
		
		admin=employee.fetchAdmin();
		
		System.out.println("\nAll Admins are : \n");

		for(Admin a:admin)
		{
			System.out.println(a);
		}
		
*/
		
		String  answer="no";
		while(answer.equals("no"))
		{
			System.out.println("\n******Operations******");
			System.out.println("\n1.Add employee ");
			System.out.println("2.Fetch employee ");
			System.out.println("3.Update employee ");
			System.out.println("4.Delete employee ");
			System.out.println("5.See All  Admins ");
			//System.out.println("6.Exit  ");
			
			System.out.println("\nEnter your choice :");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:system.AddEmployee();;
				break;
			case 2:system.Fetchemployee();
				break;
			case 3:system.UpdateEmployee();
				break;
			case 4:system.DeleteEmployee();
				break;
			case 5:system.FetchAdmin();
				break;
			default:
				System.out.println("Enter the valid option ! ");
			
			}
			
			System.out.println("\nDo you want to exist ? (yes/no)");
			answer=sc.nextLine();
			
		}
		
		
		System.out.println("\nThank you ! ");
		
	}

}
