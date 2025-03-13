package sortingsearching;
import java.util.Scanner;


public class AcendingSorting {
	
	static void printingArray(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size =sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the array elements : ");
		
		//taking user inputs for array
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//displaying array 
		System.out.println("Array before sorting : ");
		printingArray(array);

		
		//sorting in acending order
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		//printing array 
		System.out.println("Array after sorting in acending order : ");
		printingArray(array);

		
	}

}
