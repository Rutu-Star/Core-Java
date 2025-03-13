package superKeyword;

public class ParentClass {
	String name="Priya";
	int id=102;
	
	ParentClass()
	{
		System.out.println("Parent class Zero param Constructor!!");

	}
	ParentClass(int n)
	{
		
		this();
		System.out.println("Parent class one  param Constructor!!");

	}
	
	public void show()
	{
		System.out.println("Parent class zero param method!!");
		System.out.println(name+" "+id);
	}
	public void show(int id)
	{
		System.out.println("Parent class one param method!!");

		System.out.println(this.name+" "+id);

	}

}
