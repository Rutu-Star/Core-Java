package thisKeyword;

public class DemoClass {
	//instance veriable 
	String name="Priya";
	int id=102;
	
	public void show()
	{
		System.out.println("The zero param method !!");
		System.out.println(name+" "+id);
		System.out.println(this.name+" "+this.id);
	}
	
	void show(int id)
	{
		this.show();
		System.out.println("The one param method !!");
		System.out.println(name+" "+id);
		System.out.println(this.name+" "+this.id);
	}
	
	void show(String name ,int id)
	{
		show();
		this.show(id);
		System.out.println("The two param method !!");
		System.out.println(name+" "+id);
		System.out.println(this.name+" "+this.id);
	}

}
