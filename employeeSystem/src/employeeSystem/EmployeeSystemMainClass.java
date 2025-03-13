package employeeSystem;

import java.sql.SQLException;
import java.util.List;

public class EmployeeSystemMainClass {

	public static void main(String[] args) throws SQLException
	{
		EmployeeSystem employee=new EmployeeSystemImp();
		
		employee.createdatabse();
		//Add employee
		
		employee.addEmployee(new Employee(1,"Rutu","IT",50000));
		employee.addEmployee(new Employee(2,"Nikita","Computer",80000));
		employee.addEmployee(new Employee(3,"Rohan","HR",70000));
		employee.addEmployee(new Employee(4,"Sam","Manager",90000));
		employee.addEmployee(new Employee(5,"Julli","Security",40000));
		
		//view employee
		
		List<Employee> emp=employee.viewEmployee();
		
		for(Employee i:emp)
		{
			System.out.println(i);
		}
		
		//delete employee by id
		
		if(employee.removeEmployeeById(2))
		{
			System.out.println("Employee deleted successfully !!");
		}
		else
		{
			System.out.println("Employee deleted not successfully !!");
		}
		
		//view employee
				List<Employee> emp1=employee.viewEmployee();
				
				for(Employee i:emp1)
				{
					System.out.println(i);
				}
				
		//update employee
				
				
				if(employee.updateEmployee("I"))
				{
					System.out.println("Updated successfully !!");
				}
				else
				{
					System.out.println("not updated ");
				}
				//view employee
				List<Employee> emp2=employee.viewEmployee();
				
				for(Employee i:emp2)
				{
					System.out.println(i);
				}
		

	}

}
