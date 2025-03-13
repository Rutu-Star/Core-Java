package exceptionHandling;
import java.util.Scanner;

public class NullPointerExp {
	
	public static void main(String[]  str)
	{
		Scanner sc=new Scanner(System.in);
		String s=null;
		try
		{
		System.out.println(s.length());
		}catch(NullPointerException n)
		{
			System.out.println("Plz enter the string name before calculate the lenght of string ");

		}
		System.out.println("Thank you");
	}

}
