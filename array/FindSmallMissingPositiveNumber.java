package array;
import java.util.Scanner;

public class FindSmallMissingPositiveNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements of an array : ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//printing the array
		System.out.println("The given array is : ");

		for(int i=0;i<size;i++)
		{
			System.out.print(i+" ");
		}

		//find the first small positive missing  element form an array
		//the small positive start from 1
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]-1!=i)
			{
				if(arr[arr[i]-1]==arr[i]-1)
				{
					
				}
				else if(arr[i]<=0)
				{
					
				}
				else
				{
					int temp=arr[i];
					arr[i]=arr[arr[i]-1];
					arr[arr[i]-1]=temp;
				}
			}
		}
		
		int smallPositiveInt=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]!=i+1)
			{
				smallPositiveInt=i+1;
			}
		}
		
		System.out.println("The smallPositiveInt is : "+smallPositiveInt);
	}

}
