package demo1dArray;
import java.util.Scanner;
public class SumOfArray {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		//Taking size of array
		System.out.println("Enter the size of array : ");
		int size =scan.nextInt();
		int array[]=new int[size];
		
		//Taking the elements from user
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}
		
		////Printing  the elements from user
		System.out.println("Display the elements of array ! ");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}

		
		//Sum of an array
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=array[i];
		}
		
		System.out.println("\nSum of an array is : "+sum);
	}

}
