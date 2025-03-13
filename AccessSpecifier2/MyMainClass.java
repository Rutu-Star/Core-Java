package AccessSpecifier2;

import AccessSpecifier1.Demo;

public class MyMainClass {
	
	public static void main(String[] args)
	{
		//public
				ChildClass2 d=new ChildClass2();
				System.out.println(d.num);
				d.showme();
				
				//protected Specifier not accessible in another class of another package but accessible if inheritance take place but not rather than that inherited class like mymainclass 

				//System.out.println(d.num3);
				//d.showme3();
	}

}
