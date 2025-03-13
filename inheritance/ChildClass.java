package inheritance;

public class ChildClass extends Parentclass

{
	
     //error
	//Name="Ru0";
	//x=5;
	
	void display1()
	{
		x=11;
		Name="Rutuja";
		System.out.println("X :"+x);
		System.out.println("Name : "+Name);
	
	}
	
	//constructor
	
	public ChildClass(int x)
	{
		super("ty");
		
		
		System.out.println("Child Class Constructor..");
	}
	
	
	
	
}