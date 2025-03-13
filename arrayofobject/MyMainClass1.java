package arrayofobject;

public class MyMainClass1 {
	public static void main(String[] args)
	{
		ArrayOfObject obj1=new ArrayOfObject();
		System.out.println("Calling Array of Employee Object by using Constructor");
		System.out.println();
		//by using constructor
		obj1.employeeArrayOfObject();
		
		System.out.println();
		ArrayOfObject1 obj2=new ArrayOfObject1();
		System.out.println("Callin Array of Employee Object by using getter & setter method ");
		System.out.println();
		//by using getter & setter 
		obj2.employeeArrayOfObject();
	}

}
