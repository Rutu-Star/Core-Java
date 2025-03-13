package com.dao;
import com.entity.Employee;
import java.util.ArrayList;

public class EmployeeDao {
	public ArrayList<Employee> allEmployee()
	{
		ArrayList<Employee> employees=new ArrayList<Employee>();
		
		// Adding 5 Developers with unsorted IDs
        employees.add(new Employee(101, "John Doe", "Developer", 60000.0, "2022-01-05"));
        employees.add(new Employee(205, "Alice Smith", "Developer", 62000.0, "2022-03-12"));
        employees.add(new Employee(156, "Bob Johnson", "Developer", 59000.0, "2022-07-20"));
        employees.add(new Employee(324, "Carol White", "Developer", 61000.0, "2022-09-11"));
        employees.add(new Employee(289, "Eve Brown", "Developer", 63000.0, "2022-11-28"));

        // Adding 5 Testers with unsorted IDs
        employees.add(new Employee(412, "Jane Davis", "Tester", 55000.0, "2021-02-10"));
        employees.add(new Employee(369, "Peter Wilson", "Tester", 54000.0, "2021-04-25"));
        employees.add(new Employee(274, "Susan Taylor", "Tester", 56000.0, "2021-06-15"));
        employees.add(new Employee(158, "Larry Thomas", "Tester", 57000.0, "2021-08-05"));
        employees.add(new Employee(303, "Anna Moore", "Tester", 58000.0, "2021-10-01"));

        // Adding 1 CEO with a unique ID
        employees.add(new Employee(501, "Charles Clark", "CEO", 150000.0, "2019-01-01"));

        // Adding 6 Salesmen with unsorted IDs
        employees.add(new Employee(237, "Tom Lewis", "Sales", 45000.0, "2020-03-15"));
        employees.add(new Employee(189, "Jerry Walker", "Sales", 44000.0, "2020-05-22"));
        employees.add(new Employee(421, "Rick Hall", "Sales", 46000.0, "2020-07-30"));
        employees.add(new Employee(333, "Morty Allen", "Sales", 47000.0, "2020-09-10"));
        employees.add(new Employee(291, "Summer Young", "Sales", 48000.0, "2020-11-18"));
        employees.add(new Employee(377, "Beth King", "Sales", 49000.0, "2020-12-25"));

        // Adding 1 Manager with a unique ID
        employees.add(new Employee(542, "Michael Scott", "Manager", 80000.0, "2018-05-01"));

        // Adding 2 HRs with unsorted IDs
        employees.add(new Employee(199, "Rachel Green", "HR", 52000.0, "2019-04-10"));
        employees.add(new Employee(401, "Monica Geller", "HR", 53000.0, "2019-06-15"));

        
        
		return employees;
		
	}

}
