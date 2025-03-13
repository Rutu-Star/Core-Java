package staticDemo;

class Employee
{
	//instance variable or non_static Variable
	String name;
	int id;
	
	//staic variable 
	static String Company_name="ABCD";
	
	
	
	//constructor
	Employee(String name1, int id1)
	{
		name=name1;
		id=id1;
	}
	
	//non-static method
	
	void displayData()
	{
		//local Veriable 
		int X=10;
		System.out.println("Name : "+name+'\n'+"ID : "+id+'\n'+" X:"+X);
		System.out.println("Company Name :"+Company_name);
	}
	
	//Static method
	static void showme()
	{
		System.out.println("Good Morning !!");
	}
	
}