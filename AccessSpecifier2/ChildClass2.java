package AccessSpecifier2;

import AccessSpecifier1.Demo;

public class ChildClass2 extends Demo
{
	void ChildClass2()
	{
		System.out.println("hii ChildClass2");
	}
	
	public static void main(String[] args)
	{
		//public
		ChildClass2 d=new ChildClass2();
		System.out.println(d.num);
		d.showme();
		
		//Private Specifier not accessible in another class of another package but accecible in same class
		//Demo d1=new Demo(10);
		//System.out.println(d.num1);
		//d.showme1();
		
		//default Specifier not accessible in another class of another package
		//Demo dm=new Demo("rutu");
		//System.out.println(d1.num2);
		//d.showme2();
		
		//protected Specifier not accessible in another class of another package but accessible if inheritance take place but in same inheritate class not anotherclass like MyMainClass  

		System.out.println(d.num3);
		d.showme3();
		
		
		

	
	

    }


}
