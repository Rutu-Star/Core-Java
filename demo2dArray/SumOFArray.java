package demo2dArray;
import java.util.Scanner;

public class SumOFArray {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the row size of 2d array : ");
		int row=scan.nextInt();
		
		System.out.println("Enter the col size of 2d array : ");
		int col=scan.nextInt();
		
		int array[][]=new int[row][col];
		
		//Giving elements of array from user 
		System.out.println("Enter the elements  of 2d array : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=scan.nextInt();
			}
		}
		
		//Displaying the array elements
		System.out.println("Dispalying Array Elements !");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+" ");

			}
			
			System.out.println();

		}
		
		
		//sum of array elements
		
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum=sum+array[i][j];
			}
		}
		
		System.out.println("Sum of elements of an array is : "+sum);

		

		
		

		
		
		
		
	}

}
