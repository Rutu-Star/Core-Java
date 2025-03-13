package superKeyword;

public class ChildClass extends ParentClass{

	String name="Priya";
	int id=102;
	
	ChildClass()
	{
		super();//it also default call
		System.out.println("Parent class Zero param Constructor!!");

	}
	ChildClass(int n)
	{
		super(n);
		System.out.println("Parent class one  param Constructor!!");

	}
	
	ChildClass(String name ,int n)
	{
		this(n);
		System.out.println("Parent class two  param Constructor!!");

	}
	
	public void show()
	{
		System.out.println("Child class zero param method!!");
		System.out.println(this.name+" "+this.id);
		System.out.println("Parent class instance veriable!!");
		System.out.println(super.name+" "+super.id);
	}
	public void show(int id)
	{
		this.show();
		super.show();
		System.out.println("Child class one param method!!");
		System.out.println(this.name+" "+id);

	}
}
