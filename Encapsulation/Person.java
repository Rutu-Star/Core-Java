package Encapsulation;

public class Person {
	
	private String Name;
	private int Age;
	
	public void set(String Name, int Age)
	{
		this.Name=Name;
		this.Age=Age;
	}
	
	void checkEligibilty()
	{
		if(Age<1)
		{
			System.out.println("Not Valid Age Sorry");
			
		}
		else
		{
			if(Age>=18 && Age<62)
			{
				System.out.println(Name + ", "+Age+" is eligible for licence");
			
			}
			else
			{
				System.out.println(Name + ", "+Age+" is not eligible for licence");
				
			}
		}
	}

}
