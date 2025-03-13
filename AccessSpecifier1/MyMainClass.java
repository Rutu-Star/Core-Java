package AccessSpecifier1;

public class MyMainClass {
	public static void main(String[] args)
	{
		//public
		Demo d=new Demo();
		System.out.println(d.num);
		d.showme();
		
		//Private Specifier not accessible in another class
		//Demo d1=new Demo(10);
		//System.out.println(d1.num1);
		//d.showme1();
		
		
		//default 
		Demo dm=new Demo("Rutu");
		System.out.println(d.num2);
		d.showme2();
		
		
		//protected
		Demo dem=new Demo(10,20);
		System.out.println(d.num3);
		d.showme3();

	
	

    }
}
