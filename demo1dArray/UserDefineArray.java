package demo1dArray;
import java.util.Scanner;
public class UserDefineArray {
	public static void main(String[] args)
	{
		Scanner scaner=new Scanner(System.in);
		
		//Taking size of array from user
		System.out.println("Enter the size of array : ");
		int size=scaner.nextInt();
		
		int array[]=new int[size];
		
		//Taking size of array from user
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<size;i++)
		{
			array[i]=scaner.nextInt();
		}
		
		//printing the array elements
		System.out.println("Elelments of array : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		

	}

}
