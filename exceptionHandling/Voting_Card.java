package exceptionHandling;

public class Voting_Card {
	
	void Register_Eligibility_Age(int age)
	{
		if(age<18 && age>0)
		{
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException i)
			{
				System.out.println("User is miner ! ");
			}
		}
		else if(age<=0)
		{
			try {
			throw new InvalidAgeException("Invalid Age Input !");
			}
			catch(InvalidAgeException i)
			{
				//System.out.println("Invalid Age !");
				i.printStackTrace();
			}
		}
		else
		{
			System.out.println("Age coloumn  successfully updated !");
		}
	}
	
	void Register_Eligibility_Country(String str)
	{
		
	
		if(str!="INDIA")
		{
			try
			{
			throw new InvalidCountryException();
			}
			catch(InvalidCountryException i)
			{
				System.out.println("Country should be INDIA !");
			}
			
		}
		else
		{
			System.out.println("Country coloumn successfully updated ! ");
		}
	}

}
