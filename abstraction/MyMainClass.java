package abstraction;

public class MyMainClass {
	
	public static void main(String[] args)
	{
		//AbstractDemo obj=new AbstractDemo(); 
		//we can't make object of abstract class  
		AbstractChild obj=new AbstractChild();
		
		obj.m1();
		obj.m2();
		
		
		//can not create object of abstract class
		//InterfaceChildA obj2 =new InterfaceChildA();
		
		InterfaceChildB obj2=new InterfaceChildB();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
	}
	

}
