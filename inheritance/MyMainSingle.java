package inheritance ;

public class MyMainSingle
{
	public static void main(String[] args )
	{
		ChildClass ch = new ChildClass(10);
		ch.Name="Rutu";
		ch.id=102;
		ch.display();
		Parentclass.showme();
		
		
	}
	
}