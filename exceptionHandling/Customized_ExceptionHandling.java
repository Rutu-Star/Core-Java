package exceptionHandling;

public class Customized_ExceptionHandling {
	
	public static void main(String[] args)
	{
		System.out.println("User 1 :");
		Voting_Card obj1=new Voting_Card();
		obj1.Register_Eligibility_Age(40);
		obj1.Register_Eligibility_Country("America");
		
		System.out.println();
		System.out.println("User 2 :");
		Voting_Card obj2=new Voting_Card();
		obj2.Register_Eligibility_Age(12);
		obj2.Register_Eligibility_Country("INDIA");
		
	
		
		System.out.println();
		System.out.println("User 3 :");
		Voting_Card obj3=new Voting_Card();
		obj3.Register_Eligibility_Age(40);
		obj3.Register_Eligibility_Country("INDIA");
		
		System.out.println();
		System.out.println("User 4 :");
		Voting_Card obj4=new Voting_Card();
		obj4.Register_Eligibility_Age(-4);
		obj4.Register_Eligibility_Country("Korea");
		
		
		
		
		
	
	}

}
