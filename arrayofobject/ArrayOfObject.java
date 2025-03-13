package arrayofobject;
import java.util.Scanner;

public class ArrayOfObject {
	
	public void employeeArrayOfObject()
	{
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter the size of Employee class object array : ");
	int size=scan.nextInt();
	Employee e[]=new Employee[size];
    scan.nextLine(); 

	
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter the Employee Name : ");
		String name=scan.nextLine();
		
		System.out.println("Enter the Employee ID : ");
	    int id=scan.nextInt();
        scan.nextLine(); 

	    
	    e[i]=new Employee(name,id);
		
	}
	 
	displayemployeeArrayOfObject(e);
	
	}
	
	public void displayemployeeArrayOfObject(Employee e[])
	{
		System.out.println();
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);

		}
	}
	
	
	
	

}
