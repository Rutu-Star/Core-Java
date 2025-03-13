package demo2dArray;
import java.util.Scanner;

public class FindMaxElement {
	public static void main(String[] args)
	{
		int array[][]=new int[3][3];
		
		Scanner scan =new Scanner(System.in);
		
		//Taking the array elements from user
		System.out.println("Enter the elements of array[5][5] : ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]=scan.nextInt();
			}
		}
		
		
		//Printing the array elements
			System.out.println("Enter the elements of array[5][5] : ");
				
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		//finding the maximum number from array
		int max=array[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=1;j<3;j++)
			{
				if(array[i][j]>max)
				{
					max=array[i][j];
				}
			}
			
		}
		
		System.out.println("Maximum number of array is : "+max);
		
		
		
		
	}

}

