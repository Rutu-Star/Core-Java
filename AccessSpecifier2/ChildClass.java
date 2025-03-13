package AccessSpecifier2;
import AccessSpecifier1.Demo;

public class ChildClass {
	
	public static void main(String[] args)
	{
		//public
		Demo d=new Demo();
		System.out.println(d.num);
		d.showme();
		
		//Private Specifier not accecible in another class of another package but accecible in same class
		//Demo d1=new Demo(10);
		//System.out.println(d.num1);
		//d.showme1();
		
		//default Specifier not accecible in another class of another package
		//Demo dm=new Demo("rutu");
		//System.out.println(d1.num2);
		//d.showme2();
		
		//protected Specifier not accecible in another class of another package 
		//Demo dem=new Demo(10,20);
		//System.out.println(d.num3);
		//d.showme3();
		
		
		

	
	

    }

	
}
