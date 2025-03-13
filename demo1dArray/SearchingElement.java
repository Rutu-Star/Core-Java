package demo1dArray;
import java.util.Scanner;

public class SearchingElement {
	public static void main(String[] args)
	{
		
			
		int array[]= {11,33,22,44,67,1,7,4};
			
		Scanner scan=new Scanner(System.in);
			
		System.out.println("Enter the number you want to  find : ");
		int num=scan.nextInt();
		boolean find=false;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				System.out.println("Element is found on index : "+i);
				find=true;
				break;
			}
		}
			
		if(!find)
		{
			System.out.println("Sorry Element is not found in array .");
		}

		

	}
	

}
