package inheritance;

public class Parentclass extends GrandParentClass
{
	//instance veriables
	
	String Name;
	int id;
	//zero parameter constructor
	public Parentclass()
	{
		System.out.println("Zero Parameterize Parent Class Constructor..");
	}
	//constructor parameter 
	Parentclass(int x)
	{
		System.out.println(" INteger Parameterize Parent Class Constructor ..");
	}
	
	
	
	
	Parentclass(String z)
	{
		System.out.println("  String Parameterize Parent Class Constructor ..");
	}
	
	
	
	//Static veriable
	
	static int x =10;
	
	//non-static method 
	
	void display()
	{
		System.out.println("Name : "+Name +" ID : "+id);
	}
	
	//static method 
	static void showme()
	{
		System.out.println("Good Morning !!!");
	}
	
}