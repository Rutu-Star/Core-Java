package sortingsearching;
import java.util.Scanner;

public class linearSearching {
	public static void main(String[] args)
	{
		int array[]= {3,45,67,89,9,10,4,5,58};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element for searching : ");
		int num=sc.nextInt();
		
		//logic for linear searching
		int count=0;
		int index=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				count=1;
				index=i;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Element is found at index "+index);
		}
		else
		{
			System.out.println("Element is not found ");

		}
	}

}
