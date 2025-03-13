package demo2dArray;

import java.util.Scanner;

public class FindMinElement {
	
	public static void main(String[] args)
	{
		
	int row;
	int col;
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter the row size for 2d array : ");
	row=scan.nextInt();
	
	System.out.println("Enter the coloum size for 2d array : ");
	col=scan.nextInt();
	
	int array[][]=new int[row][col];

	
	
	//Taking the array elements from user
	System.out.println("Enter the elements of array[5][5] : ");
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			array[i][j]=scan.nextInt();
		}
	}
	
	
	//Printing the array elements
	System.out.println("Enter the elements of array[5][5] : ");
			
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	
	//finding the minimum number from array
	int min=array[0][0];
	for(int i=0;i<row;i++)
	{
		for(int j=1;j<col;j++)
		{
			if(array[i][j]<min)
			{
				min=array[i][j];
			}
		}
		
	}
	
	System.out.println("Minimum number of array is : "+min);
	
	
	}

}
