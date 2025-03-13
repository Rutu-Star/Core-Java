package exceptionHandling;
import java.util.Scanner;

public class AirthmeticExc {
	
	public static void main(String[]  str)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter the num2 : ");
		int num2=sc.nextInt();
		int div=0;
		try
		{
			div=num1/num2;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Infinity");

		}
		System.out.println("Division of two numbers : "+div);
		System.out.println("Thank you ! ");


		
	}

}
