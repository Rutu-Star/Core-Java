package AccessSpecifier1;

public class Demo {
	
	public int num=10;
	//constructor
	public Demo()
	{
		System.out.println("Public Specifier Demo class Constructor: Zeor Arguments");
	}
	//Method 
	public void showme()
	{
		System.out.println("Public Specifier Demo Class Method :Hii");

	}
	
	
	//private 
	private int num1=10;
	//constructor
	private Demo(int x)
	{
		System.out.println("private Specifier Demo class Constructor: One Arguments");
	}
	//Method 
	private void showme1()
	{
		System.out.println("private Specifier Demo Class Method :Hii");

	}
	
	
	//Protected
	protected int num3=10;
	//constructor
	protected Demo(int x,int y)
	{
		System.out.println("Protected Specifier Demo class Constructor: One Arguments");
	}
	//Method 
	protected void showme3()
	{
		System.out.println("Protected Specifier Demo Class Method :Hii");

	}
	
	
	

	//Default
	int num2=10;
	//constructor
	Demo(String x)
	{
		System.out.println("Default Specifier Demo class Constructor: One Arguments");
	}
	//Method 
	void showme2()
	{
		System.out.println("Default Specifier Demo Class Method :Hii");

	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		//public
		Demo d=new Demo();
		System.out.println(d.num);
		d.showme();
		
		//Private Specifier not accecible in another class but accecible in same class
		Demo d1=new Demo(10);
		System.out.println(d.num1);
		d.showme1();
		
		//default
		Demo dm=new Demo("rutu");
		System.out.println(d1.num2);
		d.showme2();
		
		//protected 
		Demo dem=new Demo(10,20);
		System.out.println(d.num3);
		d.showme3();
		
		
		

	
	

    }

}
